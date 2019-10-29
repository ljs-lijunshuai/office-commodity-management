package com.mr.mapper;

import com.mr.entity.OmsOrderReturnApply;

import java.util.List;
public interface IReturnMapper {
    List<OmsOrderReturnApply> find(OmsOrderReturnApply orra);

    int deleteReturnOrder(String[] arr);

    OmsOrderReturnApply findById(OmsOrderReturnApply oora);

    int findTotalNum(OmsOrderReturnApply oora);
}
