package com.yaosiyuan.dao;

import com.yaosiyuan.entity.MsProductDetail;

public interface MsProductDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsProductDetail record);

    int insertSelective(MsProductDetail record);

    MsProductDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsProductDetail record);

    int updateByPrimaryKey(MsProductDetail record);
}