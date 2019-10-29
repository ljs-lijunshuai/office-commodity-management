package com.mr.service;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;

import java.util.List;

public interface IReturnService {


    void find();

    int deleteReturnOrder(String ids);

    OmsOrderReturnApply findById(OmsOrderReturnApply oora);

    JyyData returnOrderList(String keyword, OmsOrderReturnApply oora);
}
