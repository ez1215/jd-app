package com.jd.mall.service.impl;

import com.jd.mall.entity.Mall;
import com.jd.mall.mapper.MallMapper;
import com.jd.mall.service.IMallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MallServiceImpl implements IMallService{

    private static final Logger logger = LoggerFactory.getLogger(MallServiceImpl.class);

    @Autowired
    private MallMapper mallMapper;

    public int deleteByPrimaryKey(Integer id) {
        return mallMapper.deleteByPrimaryKey(id);
    }

    public int insert(Mall record) {
        return mallMapper.insert(record);
    }

    public int insertSelective(Mall record) {
        logger.info(record.toString());
        return mallMapper.insertSelective(record);
    }

    public Mall selectByPrimaryKey(Integer id) {
        return mallMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Mall record) {
        return mallMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Mall record) {
        return mallMapper.updateByPrimaryKey(record);
    }
}
