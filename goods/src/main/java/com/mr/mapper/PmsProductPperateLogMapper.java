package com.mr.mapper;


import com.mr.entity.PmsProductPperateLog;

public interface PmsProductPperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductPperateLog record);

    int insertSelective(PmsProductPperateLog record);

    PmsProductPperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductPperateLog record);

    int updateByPrimaryKey(PmsProductPperateLog record);
}