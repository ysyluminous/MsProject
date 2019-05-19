
package com.yaosiyuan.service.cache;

import com.yaosiyuan.entity.MsProductInfo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
public interface MsProductInfoCacheService {

	/**
	 * 
	 * @description: 功能描述： (根据秒杀商品id查询秒杀商品)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月19日 下午10:53:58
	 * @param id
	 * @return
	 */
	public MsProductInfo queryProductById(int id);

}
