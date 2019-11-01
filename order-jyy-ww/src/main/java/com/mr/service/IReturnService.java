package com.mr.service;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;

import java.util.List;

public interface IReturnService {


    void find();

    int deleteReturnOrder(String ids);

    OmsOrderReturnApply findById(OmsOrderReturnApply oora);

    JyyData returnOrderList(OmsOrderReturnApply oora);

    int updateReturnOrder(OmsUpdateStatusParam ousp);

    /********退货原因******8*/
    JyyData findCauseOrder(OmsOrderReturnReason oorr);

    int deleteCauseOrder(String ids);

    int addCauseOrder(OmsOrderReturnReason oorr);

    int updateInitiateMode(OmsOrderReturnReason oorr);

    JyyClassData findByCauseOrderId(Long id);

    int updateCauseOrder(OmsOrderReturnReason oorr);

}
