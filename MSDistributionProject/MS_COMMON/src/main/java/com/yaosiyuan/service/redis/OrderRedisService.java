/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月23日 上午9:39:29
*/
package com.yaosiyuan.service.redis;

import java.util.Map;

import com.yaosiyuan.vo.order.ConstomOrder;

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

}
