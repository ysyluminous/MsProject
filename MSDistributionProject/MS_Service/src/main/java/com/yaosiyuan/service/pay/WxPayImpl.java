/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月9日 下午8:04:49
*/
package com.yaosiyuan.service.pay;

import org.springframework.stereotype.Service;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月9日 下午8:04:49
 */
@Service
public class WxPayImpl implements WxPay {

	/**
	 * (非 Javadoc) Title: payOrder Description:
	 * 
	 * @param tradeId
	 * @param payAmount
	 * @return
	 * @see com.yaosiyuan.service.pay.OrderPay#payOrder(java.lang.String,
	 *      java.lang.Integer)
	 */
	public int payOrder(String tradeId, Integer payAmount) {
		System.out.println("微信支付成功");
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * (非 Javadoc) Title: refundOrder Description:
	 * 
	 * @param tradeId
	 * @param payAmount
	 * @return
	 * @see com.yaosiyuan.service.pay.OrderPay#refundOrder(java.lang.String,
	 *      java.lang.Integer)
	 */
	public int refundOrder(String tradeId, Integer payAmount) {
		// TODO Auto-generated method stub
		return 1;
	}

}
