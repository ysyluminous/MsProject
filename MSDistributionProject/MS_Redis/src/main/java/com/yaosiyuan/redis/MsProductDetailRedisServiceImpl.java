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

import com.alibaba.dubbo.config.annotation.Service;
import com.yaosiyuan.entity.MsProductDetail;
import com.yaosiyuan.service.cache.MsProductDetailCacheService;
import com.yaosiyuan.service.redis.MsProductDetailRedisService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class MsProductDetailRedisServiceImpl implements MsProductDetailRedisService {

	@Autowired
	private MsProductDetailCacheService msProductDetailCacheService;

	@Autowired
	private RedisUtil redisUtil;

	public MsProductDetail selectByPrimaryKey(Integer productId) {
		MsProductDetail msProductDetail = null;

		// 从redis中取数据
		Object object = redisUtil.get("detail:" + productId);

		// 如果redis中没有 就从ehcache中找
		if (object == null) {
			msProductDetail = msProductDetailCacheService.selectByPrimaryKey(productId);
			// 并且缓存到redis中
			redisUtil.set("detail:" + productId, msProductDetail);
		} else {
			System.out.println("redis");
			msProductDetail = (MsProductDetail) object;

		}

		return msProductDetail;
	}

}
