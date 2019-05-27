/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.redis;

import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.service.redis.OrderRedisService;
import com.yaosiyuan.util.DateUtil;
import com.yaosiyuan.vo.order.ConstomOrder;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class OrderRedisServiceImpl implements OrderRedisService {

	@Autowired
	RedisUtil redisUtil;


	@Autowired
	AmqpTemplate amqpTemplate;

	/**
	 * (非 Javadoc) Title: secKill Description:
	 * 
	 * @param userId
	 * @param productId
	 * @param msOrder
	 * @return
	 */
	@Override
	public Map<String, Object> secKill(int userId, int productId, ConstomOrder msOrder) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 库存总数
		int stockCount = msOrder.getStockCount();
		if (redisUtil.getKeyListSize(productId + "") > stockCount) {
			System.out.println("秒杀失败");
			resultMap.put("success", false);
		}
		redisUtil.pushList(productId + "", userId + "");

		// 把订单信息放到redis 不走数据库，
		String key = "userId:" + userId + "==productId:" + productId;
		String value = "";

		String createTimeString = DateUtil.transferDate(new Date(), "yyyy-MM-dd HH:mm:ss");
		String merchantId = msOrder.getMerchantId() + "";
		String payAmount = msOrder.getPayAmount() + "";
		String receivingadress = msOrder.getReceiveAddress();
		String receiveName = msOrder.getReceiveName();
		String receivePhone = msOrder.getReceivePhone() + "";
		String stockcountnum = msOrder.getStockCount() + "";
		String tradeserialnumber = createTimeString + UUID.randomUUID();
		String paystatus = "1";
		value += paystatus + "==" + tradeserialnumber + "==" + createTimeString + "==" + merchantId + "==" + payAmount
				+ "==" + receivingadress + "==" + receiveName + "==" + receivePhone + "==" + stockcountnum;
		redisUtil.set(key, value);

		Map<String, String> dateMap = new HashMap<String, String>();
		dateMap.put("createtime", createTimeString);
		dateMap.put("merchantId", merchantId);
		dateMap.put("payAmount", payAmount);
		dateMap.put("receivingadress", receivingadress);
		dateMap.put("receiveName", receiveName);
		dateMap.put("receivePhone", receivePhone);
		dateMap.put("stockcountnum", stockcountnum);
		dateMap.put("tradeId", tradeserialnumber);
		dateMap.put("paystatus", paystatus);
		dateMap.put("productId", productId + "");
		dateMap.put("userId", userId + "");

		resultMap.put("success", true);
		resultMap.put("dateMap", dateMap);

		//发送消息到消息队列，第一个参数是交换机名称，第二个参数是队列名称
		amqpTemplate.convertAndSend("ms_exchange","orderinfoaction",dateMap);
		System.out.println("秒杀成功");

		return resultMap;
	}

	@Override
	public boolean payOrder(Integer payType, Integer userId, Integer productId, Integer merchantId, String tradeId,
							Integer payAmount) {

		String key = "userId:" + userId + "==productId:" + productId;
		String value = (String) redisUtil.get(key);
		String[] splitvalues = value.split("==");
		splitvalues[0] = "2";
		value = "";
		for (String temp : splitvalues) {
			value += temp + "==";
		}
		boolean isSuccess = redisUtil.set(key, value);

		Map<String, String> dateMap = new HashMap<String, String>();
		dateMap.put("tradeId", tradeId);
		dateMap.put("payStatus", "2");
 		String payTimeString = DateUtil.transferDate(new Date(),"yyyy-MM-dd HH:mm:ss");
 		dateMap.put("payTimeString",payTimeString);
 		dateMap.put("payType",payType+"");
		dateMap.put("flag","pay");
		amqpTemplate.convertAndSend("ms_exchange","payInfoService",dateMap);
		return isSuccess;
	}

	/**
	 *
	 * @param userId
	 * @return
	 */
	@Override
	public List<MsOrder> queryOrderByUserId(Integer userId) {

		List<MsOrder> listMsOrder = new ArrayList<MsOrder>();
		Set<String> keys = redisUtil.getKeys("userId:" + userId);
		for (String key : keys) {
			String[] prusers = key.split("==");
			if (prusers.length <= 1) {
				continue;
			}
			String productid = prusers[1].split(":")[1];
			String useridstring = prusers[0].split(":")[1];
			String value = (String) redisUtil.get(key);
			String[] valuearray = value.split("==");
			String paystatus = valuearray[0];
			String tradeserialnumber = valuearray[1];
			String createtimestring = valuearray[2];
			String merchantid = valuearray[3];
			String payamount = valuearray[4];
			String receivingadress = valuearray[5];
			String receivingname = valuearray[6];
			String receivingphone = valuearray[7];
			String stockcountnum = valuearray[8];
			MsOrder msorder = new MsOrder();
			msorder.setCreateTime(DateUtil.transferDate(createtimestring, "yyyy-MM-dd HH:mm:ss"));
			msorder.setPayAmount(Integer.valueOf(payamount));
			msorder.setMerchantId(Integer.valueOf(merchantid));
			msorder.setReceiveAddress(receivingadress);
			msorder.setReceiveName(receivingname);
			msorder.setProductId(Integer.valueOf(productid));
			msorder.setReceivePhone(Integer.valueOf(receivingphone));
			msorder.setTradeId(tradeserialnumber);
			msorder.setUserId(userId);
			msorder.setNum(1);
			msorder.setPayStatus(Integer.valueOf(paystatus));
			listMsOrder.add(msorder);
		}
		return listMsOrder;
	}


	@Override
	public void updagteOrderStatusBytradeId(String flag,Integer userId,Integer payStatusParam,String tradeIdParam,Integer payType) {

		List<MsOrder> listMsOrder = new ArrayList<MsOrder>();
		Set<String> keys = redisUtil.getKeys("userId:" + userId);
		for (String key : keys) {
			String[] prusers = key.split("==");
			if (prusers.length <= 1) {
				continue;
			}
			String productid = prusers[1].split(":")[1];
			String useridstring = prusers[0].split(":")[1];
			String value = (String) redisUtil.get(key);
			String[] valuearray = value.split("==");
			String tradeserialnumber = valuearray[1];

			if (! tradeIdParam.equals(tradeserialnumber)){
				continue;
			}
			String createTimeString = valuearray[2];
			String merchantId = valuearray[3];
			String payAmount = valuearray[4];
			String receivingadress = valuearray[5];
			String receiveName = valuearray[6];
			String receivePhone = valuearray[7];
			String stockcountnum = valuearray[8];

			String valueTemp = payStatusParam + "==" + tradeserialnumber + "==" + createTimeString + "==" + merchantId + "==" + payAmount
					+ "==" + receivingadress + "==" + receiveName + "==" + receivePhone + "==" + stockcountnum;

			//保存到redis
			redisUtil.set(key,valueTemp);
			Map<String, String> dateMap = new HashMap<String, String>();
			if ("update".equals(flag)){

				dateMap.put("tradeId", tradeIdParam);
				dateMap.put("payStatus", payStatusParam+"");
				dateMap.put("flag","updateByTradeId");
			}else if("refund".equals(flag)){
				dateMap.put("tradeId", tradeIdParam);
				dateMap.put("payStatus", payStatusParam+"");
				dateMap.put("payAmount", payAmount+"");
				dateMap.put("payAmount", payType+"");
				dateMap.put("flag","updateByTradeId");
			}

			//发送异步消息

			amqpTemplate.convertAndSend("ms_exchange","payInfoService",dateMap);
		}

	}


}
