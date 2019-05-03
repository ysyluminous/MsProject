package com.yaosiyuan.dao;

import com.yaosiyuan.entity.MsProductInfo;

public interface MsProductInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsProductInfo record);

    int insertSelective(MsProductInfo record);

    MsProductInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsProductInfo record);

    int updateByPrimaryKey(MsProductInfo record);
}