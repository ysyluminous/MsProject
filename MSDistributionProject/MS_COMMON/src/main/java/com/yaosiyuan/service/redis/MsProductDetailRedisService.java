/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.service.redis;

import com.yaosiyuan.entity.MsProductDetail;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
public interface MsProductDetailRedisService {

	public MsProductDetail selectByPrimaryKey(Integer id);

}
