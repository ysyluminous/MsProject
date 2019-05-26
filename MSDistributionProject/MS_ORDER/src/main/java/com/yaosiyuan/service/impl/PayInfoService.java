package com.yaosiyuan.service.impl;


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
 * @Description 更新支付信息消息队列
 * @Date 16:17 2019/5/26
 * @Param
 * @return
 **/
public class PayInfoService implements MessageListener {
	@Autowired
	MsOrderService msOrderService;

	@Override
	public void onMessage(Message message) {
		System.out.println("消息消费者 = " + message.toString());

		try {
			byte[] body = message.getBody();

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body);
			ObjectInputStream objectInputStream = null;
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			Map<String,String> dataMap = (Map<String, String>) objectInputStream.readObject();

			String tradeId = dataMap.get("tradeId");
			String payStatus = dataMap.get("payStatus");
			String payTime = dataMap.get("payTimeString");
			String payType = dataMap.get("payType");

			msOrderService.updateOrderStatusByTradeId(Integer.valueOf(payStatus),tradeId,Integer.valueOf(payType),
					DateUtil.transferDate(payTime,"yyyy-MM-dd HH:ss:mm"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
