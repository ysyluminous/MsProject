package com.yaosiyuan.dao;

import com.yaosiyuan.entity.MsOrder;

public interface MsOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsOrder record);

    int insertSelective(MsOrder record);

    MsOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsOrder record);

    int updateByPrimaryKey(MsOrder record);
}