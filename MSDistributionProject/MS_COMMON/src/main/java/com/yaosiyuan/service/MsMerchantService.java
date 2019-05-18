/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:26:22
*/
package com.yaosiyuan.service;

import java.util.List;

import com.yaosiyuan.entity.MsMerchant;
import com.yaosiyuan.vo.MsMerchantVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:26:22
 */
public interface MsMerchantService {

	public int deleteByPrimaryKey(int id);

	public int insert(MsMerchant record);

	public int insertSelective(MsMerchant record);

	public MsMerchant selectByPrimaryKey(int id);

	public int updateByPrimaryKeySelective(MsMerchant record);

	public int updateByPrimaryKey(MsMerchant record);

	public List<MsMerchant> queryMsMerchantByVo(MsMerchantVo msMerchantVo);

	public MsMerchant selectByMerchantAccount(String merchantAccount);
}
