package com.mr.service;

import com.mr.entity.OmsOrder;
import com.mr.entity.OmsOrderDetail;
import com.mr.util.DataGridWw;
import com.mr.util.WwData;

public interface IOmsOrderService {

    WwData list(String keyword, OmsOrder omsOrder);

    OmsOrderDetail detail(OmsOrderDetail ood);
}
