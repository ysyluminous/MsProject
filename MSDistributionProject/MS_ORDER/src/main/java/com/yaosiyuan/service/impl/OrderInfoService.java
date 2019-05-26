package com.yaosiyuan.service.impl;


import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.service.MsOrderService;
import com.yaosiyuan.util.DateUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

/**
 * @Author YaoSiyuan
 * @Description 更新订单信息消息队列
 * @Date 16:18 2019/5/26
 * @Param
 * @return
 **/
public class OrderInfoService implements MessageListener {

	@Autowired
	MsOrderService msOrderService;

	@Override
	public void onMessage(Message message) {
		System.out.println("消息消费者 = " + message.toString());

		byte[] body = message.getBody();

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body);
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			Map<String,String> dataMap = (Map<String, String>) objectInputStream.readObject();


			String createtime = dataMap.get("createtime");
			String merchantId = dataMap.get("merchantId");
			String payAmount = dataMap.get("payAmount");
			String receivingadress = dataMap.get("receivingadress");
			String receiveName = dataMap.get("receiveName");
			String receivePhone = dataMap.get("receivePhone");
			String stockcountnum = dataMap.get("stockcountnum");
			String tradeId = dataMap.get("tradeId");
			String paystatus = dataMap.get("paystatus");
			String productId = dataMap.get("productId");
			String userId = dataMap.get("userId");

			MsOrder msOrder = new MsOrder();
			msOrder.setUserId(Integer.valueOf(userId));
			msOrder.setProductId(Integer.valueOf(productId));
			msOrder.setCreateTime(DateUtil.transferDate(createtime,"yyyy-MM-dd HH:mm:ss"));
			msOrder.setTradeId(tradeId);
			msOrder.setMerchantId(Integer.valueOf(merchantId));
			msOrder.setNum(1);
			msOrder.setPayAmount(Integer.valueOf(payAmount));
			msOrder.setPayStatus(Integer.valueOf(paystatus));
			msOrder.setReceiveAddress(receivingadress);
			msOrder.setReceivePhone(Integer.valueOf(receivePhone));
			msOrder.setReceiveName(receiveName);

			msOrderService.insert(msOrder);

		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
