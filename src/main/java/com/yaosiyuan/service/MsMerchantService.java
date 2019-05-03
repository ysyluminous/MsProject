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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaosiyuan.dao.MsMerchantMapper;
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
@Service
public class MsMerchantService {
	@Autowired
	MsMerchantMapper msMerchantMapper;

	public int deleteByPrimaryKey(int id) {
		return msMerchantMapper.deleteByPrimaryKey(id);

	}

	public int insert(MsMerchant record) {
		return msMerchantMapper.insert(record);

	}

	public int insertSelective(MsMerchant record) {
		return msMerchantMapper.insertSelective(record);

	}

	public MsMerchant selectByPrimaryKey(int id) {
		return msMerchantMapper.selectByPrimaryKey(id);

	}

	public int updateByPrimaryKeySelective(MsMerchant record) {
		return msMerchantMapper.updateByPrimaryKeySelective(record);

	}

	public int updateByPrimaryKey(MsMerchant record) {
		return msMerchantMapper.updateByPrimaryKey(record);

	}

	public List<MsMerchant> queryMsMerchantByVo(MsMerchantVo msMerchantVo) {
		return msMerchantMapper.queryMsmerchantByVo(msMerchantVo);

	}
}
