package com.yaosiyuan.dao;

import java.util.List;

import com.yaosiyuan.entity.MsUser;

public interface MsUserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(MsUser record);

	int insertSelective(MsUser record);

	MsUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(MsUser record);

	int updateByPrimaryKey(MsUser record);

	List<MsUser> queryMsUserByVo(MsUser msUser);
}