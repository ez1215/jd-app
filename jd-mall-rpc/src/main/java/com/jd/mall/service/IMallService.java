package com.jd.mall.service;

import com.jd.mall.entity.Mall;

public interface IMallService {

    int deleteByPrimaryKey(Integer id);

    int insert(Mall record);

    int insertSelective(Mall record);

    Mall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mall record);

    int updateByPrimaryKey(Mall record);
}
