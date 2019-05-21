/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.service.cache.MsProductInfoCacheService;
import com.yaosiyuan.service.redis.MsProductInfoRedisService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class MsProductInfoRedisServiceImpl implements MsProductInfoRedisService {

	@Autowired
	MsProductInfoCacheService msProductInfoCacheService;

	@Autowired
	private RedisUtil redisUtil;

	public MsProductInfo queryProductById(int id) {
		MsProductInfo msProductInfo = null;
		Object object = redisUtil.get("product:" + id);
		// 如果redis中没有
		if (object == null) {
			// 从ehcache中取
			msProductInfo = msProductInfoCacheService.queryProductById(id);
			// 存到redis
			redisUtil.set("product:" + id, msProductInfo);
		} else {
			msProductInfo = (MsProductInfo) object;
			System.out.println("redis");

		}
		return msProductInfo;

	}

}
