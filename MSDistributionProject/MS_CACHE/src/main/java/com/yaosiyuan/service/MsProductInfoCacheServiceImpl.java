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
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.service.cache.MsProductInfoCacheService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
@Service
public class MsProductInfoCacheServiceImpl implements MsProductInfoCacheService {

	@Autowired
	MsProductInfoService msProductInfoService;

	@Override
	@Cacheable(value = "MS_Cache", key = "'user:'+#id")
	public MsProductInfo queryProductById(int id) {
		System.out.println("看到这条消息证明去查询数据库");
		return msProductInfoService.queryProductById(id);
	}


	@Override
	@CachePut(value = "MS_Cache", key = "'user:'+#id")
	public MsProductInfo upadteProductById(MsProductInfo MsProductInfo) {
		msProductInfoService.updateMsProductInfo(MsProductInfo);
		return msProductInfoService.queryProductById(MsProductInfo.getId());
	}

}
