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

import com.yaosiyuan.dao.MsUserMapper;
import com.yaosiyuan.entity.MsUser;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:26:22
 */
@Service
public class MsUserService {
	@Autowired
	MsUserMapper msUserMapper;

	public int deleteByPrimaryKey(Integer id) {
		return msUserMapper.deleteByPrimaryKey(id);

	}

	public int insert(MsUser record) {
		return msUserMapper.insert(record);

	}

	public int insertSelective(MsUser record) {
		return msUserMapper.insertSelective(record);

	}

	public MsUser selectByPrimaryKey(Integer id) {
		return msUserMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(MsUser record) {
		return msUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(MsUser record) {
		return msUserMapper.updateByPrimaryKey(record);
	}

	public List<MsUser> queryMsUserByVo(MsUser msUser) {
		return msUserMapper.queryMsUserByVo(msUser);

	}
}
