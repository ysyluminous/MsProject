/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
*/
package com.yaosiyuan.service;

import java.util.List;

import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.vo.MsProductVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:48:45
 */
public interface MsProductInfoService {

	/**
	 * 
	 * @description: 功能描述： (申请秒杀商品)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月5日 上午9:26:12
	 * @param msProductInfo
	 */
	public void applyMsProduct(MsProductInfo msProductInfo);

	/**
	 * 
	 * @description: 功能描述： (秒杀商品列表)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月5日 上午9:26:12
	 * @param msProductInfo
	 */
	public List<MsProductInfo> listMsProduct(MsProductVo msProductVo);

	public MsProductInfo queryProductById(int id);

	public void deleteProductById(int id);

	/**
	 * 
	 * @description: 功能描述： (根据id更新状态)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月5日 下午1:16:53
	 * @param id
	 * @param state
	 */
	public void updateProductState(int id, int state);

	public void updateMsProductInfo(MsProductInfo msproductinfo);

}
