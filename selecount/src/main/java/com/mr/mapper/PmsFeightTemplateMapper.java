package com.mr.mapper;


import com.mr.entity.PmsFeightTemplate;

public interface PmsFeightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);
}