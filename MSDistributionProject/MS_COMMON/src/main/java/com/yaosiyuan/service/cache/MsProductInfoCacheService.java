
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




	/**
	 * @Author YaoSiyuan                         
	 * @Description 根据商品id更新信息
	 * @Date 14:07 2019/5/27
	 * @Param [id]
	 * @return com.yaosiyuan.entity.MsProductInfo       
	 **/       
	public MsProductInfo upadteProductById(MsProductInfo MsProductInfo);



}
