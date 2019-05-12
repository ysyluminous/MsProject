/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月9日 下午8:02:44
*/
package com.yaosiyuan.service.pay;

/**
 * @description: 功能描述 (通用支付接口)
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月9日 下午8:02:44
 */
public interface OrderPay {

	/**
	 * 
	 * @description: 功能描述： (订单支付)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午8:06:53
	 * @param tradeId
	 * @param payAmount
	 * @return 1,代表支付成功，2代表支付失败
	 */
	public int payOrder(String tradeId, Integer payAmount);

	/**
	 * 
	 * @description: 功能描述： (退款)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午8:06:53
	 * @param tradeId
	 * @param payAmount
	 * @return 1,代表支付成功，2代表支付失败
	 */
	public int refundOrder(String tradeId, Integer payAmount);

}
