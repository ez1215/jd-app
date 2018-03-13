package com.jd.mall.mapper;

import com.jd.mall.entity.Mall;

public interface MallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mall record);

    int insertSelective(Mall record);

    Mall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mall record);

    int updateByPrimaryKey(Mall record);
}