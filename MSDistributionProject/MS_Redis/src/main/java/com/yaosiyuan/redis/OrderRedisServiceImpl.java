/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.redis;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaosiyuan.service.redis.OrderRedisService;
import com.yaosiyuan.util.DateUtil;
import com.yaosiyuan.vo.order.ConstomOrder;

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

	/**
	 * (非 Javadoc) Title: secKill Description:
	 * 
	 * @param userId
	 * @param productId
	 * @param msOrder
	 * @return
	 * @see com.yaosiyuan.service.redis.OrderRedisService#secKill(int, int,
	 *      com.yaosiyuan.entity.MsOrder)
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
		String key = "userId:" + userId + "==productId" + productId;
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
		dateMap.put("merchantid", merchantId);
		dateMap.put("payamount", payAmount);
		dateMap.put("receivingadress", receivingadress);
		dateMap.put("receivingname", receiveName);
		dateMap.put("receivingphone", receivePhone);
		dateMap.put("stockcountnum", stockcountnum);
		dateMap.put("tradeserialnumber", tradeserialnumber);
		dateMap.put("paystatus", paystatus);
		dateMap.put("productid", productId + "");
		dateMap.put("userid", userId + "");

		resultMap.put("success", true);
		resultMap.put("datamap", dateMap);

		System.out.println("秒杀成功");

		return resultMap;
	}

}
