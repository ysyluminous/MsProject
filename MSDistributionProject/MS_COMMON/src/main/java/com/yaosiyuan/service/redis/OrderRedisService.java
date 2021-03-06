/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月23日 上午9:39:29
*/
package com.yaosiyuan.service.redis;

import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.vo.order.ConstomOrder;

import java.util.List;
import java.util.Map;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月23日 上午9:39:29
 */
public interface OrderRedisService {

	public Map<String, Object> secKill(int userId, int productId, ConstomOrder msOrder);

	public boolean payOrder(Integer payType, Integer userId, Integer productId, Integer merchantId, String tradeId,
			Integer payAmount);

	public List<MsOrder> queryOrderByUserId(Integer userId);
	public void updagteOrderStatusBytradeId(String flag,Integer userId,Integer payStatusParam,String tradeIdParam,Integer payType);

}
