package com.ying.js.car.dao.mapper;

import com.ying.js.car.dao.model.FeeBase;

public interface FeeBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FeeBase record);

    int insertSelective(FeeBase record);

    FeeBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FeeBase record);

    int updateByPrimaryKey(FeeBase record);
}