package com.mr.mapper;

import com.mr.entity.PmsProduct;
import com.mr.entity.PmsProductWithBLOBs;

public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductWithBLOBs record);

    int insertSelective(PmsProductWithBLOBs record);

    PmsProductWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PmsProductWithBLOBs record);

    int updateByPrimaryKey(PmsProduct record);
}