package com.mr.mapper;


import com.mr.entity.PmsSkuStock;

public interface PmsSkuStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);
}