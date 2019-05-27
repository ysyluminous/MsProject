package com.yaosiyuan.service.impl;


import com.yaosiyuan.service.MsOrderService;
import com.yaosiyuan.service.pay.AliPay;
import com.yaosiyuan.service.pay.WxPay;
import com.yaosiyuan.service.pay.YlPay;
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
    @Autowired
    AliPay aliPay;

    @Autowired
    WxPay wxPay;

    @Autowired
    YlPay ylPay;

	@Override
	public void onMessage(Message message) {
		System.out.println("消息消费者 = " + message.toString());

		try {
			byte[] body = message.getBody();

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body);
			ObjectInputStream objectInputStream = null;
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			Map<String,String> dataMap = (Map<String, String>) objectInputStream.readObject();
            String flag = dataMap.get("flag");
            //updateByTradeId为退款时更新支付状态标识符
            if ("updateByTradeId".equals(flag)){
                String tradeId = dataMap.get("tradeId");
                String payStatus = dataMap.get("payStatus");

                msOrderService.updateOrderByTradeId(Integer.valueOf(payStatus),tradeId);

            }else if ("refund".equals(flag)){
                String tradeId = dataMap.get("tradeId");
                String payStatusString = dataMap.get("payStatus");
                String payTypeString = dataMap.get("payType");
                String payAmountString = dataMap.get("payAmount");

                Integer payStatus = Integer.valueOf(payStatusString);
                Integer payType = Integer.valueOf(payTypeString);
                Integer payAmount = Integer.valueOf(payAmountString);
                if (payStatus == 3) {
                    int payStatusTemp = 2;
                    // 支付宝
                    if (payType == 1) {
                        payStatusTemp = aliPay.refundOrder(tradeId, payAmount);
                        // 微信
                    } else if (payType == 2) {
                        payStatusTemp = wxPay.refundOrder(tradeId, payAmount);
                        // 银联
                    } else if (payType == 3) {
                        payStatusTemp = ylPay.refundOrder(tradeId, payAmount);
                    }

                    // 如果退款成功
                    if (payStatusTemp == 1) {
                        msOrderService.updateOrderByTradeId(payStatus, tradeId);
                    }

                } else if (payStatus == 5) {
                    msOrderService.updateOrderByTradeId(payStatus, tradeId);
                }
            }else {
                String tradeId = dataMap.get("tradeId");
                String payStatus = dataMap.get("payStatus");
                String payTime = dataMap.get("payTimeString");
                String payType = dataMap.get("payType");

			msOrderService.updateOrderStatusByTradeId(Integer.valueOf(payStatus),tradeId,Integer.valueOf(payType),
					DateUtil.transferDate(payTime,"yyyy-MM-dd HH:ss:mm"));
            }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
