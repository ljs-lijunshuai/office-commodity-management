package com.mr.mapper;


import com.mr.entity.OmsOrderReturnApply;

public interface OmsOrderReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);
}