package com.yaosiyuan.dao;

import java.util.List;

import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.vo.MsProductVo;

public interface MsProductInfoMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(MsProductInfo record);

	int insertSelective(MsProductInfo record);

	void applyMsProduct(MsProductInfo record);

	MsProductInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(MsProductInfo record);

	int updateByPrimaryKey(MsProductInfo record);

	int updateProductState(MsProductVo msProductVo);

	List<MsProductInfo> listMsProduct(MsProductVo msProductVo);
}