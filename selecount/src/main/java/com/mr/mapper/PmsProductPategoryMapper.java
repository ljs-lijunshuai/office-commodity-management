package com.mr.mapper;


import com.mr.entity.PmsProductPategory;

public interface PmsProductPategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductPategory record);

    int insertSelective(PmsProductPategory record);

    PmsProductPategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductPategory record);

    int updateByPrimaryKeyWithBLOBs(PmsProductPategory record);

    int updateByPrimaryKey(PmsProductPategory record);
}