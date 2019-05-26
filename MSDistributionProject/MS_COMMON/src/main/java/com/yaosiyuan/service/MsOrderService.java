/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月9日 上午8:59:45
*/
package com.yaosiyuan.service;

import com.yaosiyuan.entity.MsOrder;

import java.util.Date;
import java.util.List;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月9日 上午8:59:45
 */
public interface MsOrderService {

	public int insert(MsOrder record);

	public List<MsOrder> queryOrderByUserId(Integer userId);

	public void updateOrderStatusById(Integer payStatus, Integer id, Integer payType);

	public List<MsOrder> queryOrderListByMerId(Integer merchantId);

	public void updateOrderStatusByTradeId(Integer payStatus, String tradeId, Integer payType, Date payTime);



	public void updateOrderByTradeId(Integer payStatus, String tradeId);
}
