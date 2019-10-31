package com.mr.service;

import com.mr.entity.OmsOrder;
import com.mr.entity.OmsOrderDetail;
import com.mr.util.DataGridWw;
import com.mr.util.WwData;
import com.mr.util.WwDataOod;

public interface IOmsOrderService {

    WwData list(String keyword, OmsOrder omsOrder);

    int delete(Long id);

    OmsOrderDetail detail(Long id);
}
