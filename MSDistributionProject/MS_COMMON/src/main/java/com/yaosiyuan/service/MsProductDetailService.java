/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.service;

import com.yaosiyuan.entity.MsProductDetail;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
public interface MsProductDetailService {

	public int deleteByPrimaryKey(Integer id);

	public int insert(MsProductDetail record);

	public MsProductDetail selectByPrimaryKey(Integer id);

	public int updateByPrimaryKey(MsProductDetail record);
}
