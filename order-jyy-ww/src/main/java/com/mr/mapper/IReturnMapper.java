package com.mr.mapper;

import com.mr.entity.OmsOrderReturnApply;

import java.util.List;
public interface IReturnMapper {
    List<OmsOrderReturnApply> find();

    int deleteReturnOrder(String[] arr);
}
