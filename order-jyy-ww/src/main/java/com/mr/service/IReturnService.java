package com.mr.service;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;
import com.mr.util.ut.OorrClassData;
import com.mr.util.ut.OorrData;

import java.util.List;

public interface IReturnService {


    void find();

    int deleteReturnOrder(String ids);

    OmsOrderReturnApply findById(OmsOrderReturnApply oora);

    JyyData returnOrderList(Integer pageSize, Integer pageNumber);

    int updateReturnOrder(OmsUpdateStatusParam ousp);

    /********退货原因******8*/
    OorrData findCauseOrder(OmsOrderReturnReason oorr);

    int deleteCauseOrder(String ids);

    int addCauseOrder(OmsOrderReturnReason oorr);

    int updateInitiateMode(OmsOrderReturnReason oorr);

    OorrClassData findByCauseOrderId(Long id);

    int updateCauseOrder(OmsOrderReturnReason oorr);

}
