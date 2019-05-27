/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yaosiyuan.entity.MsProductDetail;
import com.yaosiyuan.service.cache.MsProductDetailCacheService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class MsProductDetailCacheServiceImpl implements MsProductDetailCacheService {

	@Autowired
	MsProductDetailService msProductDetailService;

	@Override
	@Cacheable(value = "MS_Cache", key = "'product:' + #id")
	public MsProductDetail selectByPrimaryKey(Integer id) {
		System.out.println("看到这条消息证明去查询数据库");
		return msProductDetailService.selectByPrimaryKey(id);
	}

}
