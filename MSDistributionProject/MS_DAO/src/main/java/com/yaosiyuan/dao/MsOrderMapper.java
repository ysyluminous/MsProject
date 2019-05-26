package com.yaosiyuan.dao;

import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.entity.MsOrderExample;
import com.yaosiyuan.vo.order.MsOrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yaosiyuan
 */
public interface MsOrderMapper {
  	/**
	 * @Author YaoSiyuan
	 * @Description 通过用户id更改支付状态
	 * @Date 20:30 2019/5/26
	 * @Param [msOrderVo]
	 * @return void
	 **/
	public void updateOrderStatusById(MsOrderVo msOrderVo);

	/**
	 * @Author YaoSiyuan
	 * @Description 根据订单交易号更改支付状态
	 * @Date 20:30 2019/5/26
	 * @Param [msOrderVo]
	 * @return void
	 **/
	public void updateOrderStatusByTradeId(MsOrderVo msOrderVo);
	/**
	 * @Author YaoSiyuan
	 * @Description 根据流水号更新订单
	 * @Date 20:32 2019/5/26
	 * @Param [msOrderVo]
	 * @return void
	 **/
	public void updateOrderByTradeId(MsOrder record);


	long countByExample(MsOrderExample example);

	int deleteByExample(MsOrderExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(MsOrder record);

	List<MsOrder> queryOrderByUserId(Integer userId);

	int insertSelective(MsOrder record);

	List<MsOrder> selectByExample(MsOrderExample example);

	MsOrder selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

	int updateByExample(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

	int updateByPrimaryKeySelective(MsOrder record);

	int updateByPrimaryKey(MsOrder record);

	/**
	 * @description: 功能描述： (根据商家id查询订单)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月12日 下午3:19:02
	 * @param merchantId
	 * @return
	 */
	public List<MsOrder> queryOrderListByMerId(Integer merchantId);
}