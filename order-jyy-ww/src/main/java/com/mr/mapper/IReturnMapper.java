package com.mr.mapper;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;

import java.util.List;
public interface IReturnMapper {
    List<OmsOrderReturnApply> find(OmsOrderReturnApply orra);

    int deleteReturnOrder(String[] arr);

    OmsOrderReturnApply findById(OmsOrderReturnApply oora);

    int findTotalNum(OmsOrderReturnApply oora);

    int updateReturnOrder(OmsUpdateStatusParam ousp);
    /**/
    int findCauseTotalNum(OmsOrderReturnReason oorr);

    List<OmsOrderReturnReason> findCause(OmsOrderReturnReason oorr);

    int deleteCauseOrder(String[] arr);

    int addCauseOrder(OmsOrderReturnReason oorr);

    int updateInitiateMode(OmsOrderReturnReason oorr);

    OmsOrderReturnReason findByCauseOrderId(Long id);

    int updateCauseOrder(OmsOrderReturnReason oorr);
}
