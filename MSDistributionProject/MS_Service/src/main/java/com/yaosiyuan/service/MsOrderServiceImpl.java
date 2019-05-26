/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月9日 上午8:59:45
*/
package com.yaosiyuan.service;

import com.yaosiyuan.dao.MsOrderMapper;
import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.vo.order.ConstomOrder;
import com.yaosiyuan.vo.order.MsOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class MsOrderServiceImpl implements MsOrderService {
	@Autowired
	MsOrderMapper msOrderMapper;

	@Override
	public int insert(MsOrder record) {
		return msOrderMapper.insert(record);
	}

	@Override
	public List<MsOrder> queryOrderByUserId(Integer userId) {
		return msOrderMapper.queryOrderByUserId(userId);

	}

	@Override
	public void updateOrderStatusById(Integer payStatus, Integer id, Integer payType) {
		MsOrderVo msOrderVo = new MsOrderVo();
		ConstomOrder constomOrder = new ConstomOrder();
		constomOrder.setPayStatus(payStatus);
		constomOrder.setId(id);
		constomOrder.setPayType(payType);
		msOrderVo.setConstomOrder(constomOrder);
		msOrderMapper.updateOrderStatusById(msOrderVo);

	}

	@Override
	public List<MsOrder> queryOrderListByMerId(Integer merchantId) {
		return msOrderMapper.queryOrderListByMerId(merchantId);

	}




	@Override
	public void updateOrderStatusByTradeId(Integer payStatus, String tradeId, Integer payType, Date payTime) {
		MsOrderVo msOrderVo = new MsOrderVo();
		ConstomOrder constomOrder = new ConstomOrder();
		constomOrder.setPayStatus(payStatus);
		constomOrder.setTradeId(tradeId);
		constomOrder.setPayType(payType);
		constomOrder.setPayTime(payTime);
		msOrderVo.setConstomOrder(constomOrder);
		msOrderMapper.updateOrderStatusByTradeId(msOrderVo);

	}

	@Override
	public void updateOrderByTradeId(Integer payStatus, String tradeId) {
		MsOrder msOrder = new MsOrder();
		msOrder.setPayStatus(payStatus);
		msOrder.setTradeId(tradeId);
		msOrderMapper.updateOrderByTradeId(msOrder);

	}


}
