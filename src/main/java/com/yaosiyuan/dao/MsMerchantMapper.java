package com.yaosiyuan.dao;

import java.util.List;

import com.yaosiyuan.entity.MsMerchant;
import com.yaosiyuan.vo.MsMerchantVo;

public interface MsMerchantMapper {
	int deleteByPrimaryKey(int id);

	int insert(MsMerchant record);

	int insertSelective(MsMerchant record);

	MsMerchant selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(MsMerchant record);

	int updateByPrimaryKey(MsMerchant record);

	List<MsMerchant> queryMsmerchantByVo(MsMerchantVo msMerchantVo);

	MsMerchant selectByMerchantAccount(String merchantAccount);
}