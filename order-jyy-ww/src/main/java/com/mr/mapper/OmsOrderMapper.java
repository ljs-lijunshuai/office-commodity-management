
package com.mr.mapper;


import com.mr.entity.OmsOrder;
import com.mr.entity.OmsOrderDetail;

import java.util.List;

public interface OmsOrderMapper {

    int findTotalNum(OmsOrder omsOrder);

    List<OmsOrder> list(OmsOrder omsOrder);

    OmsOrderDetail detail(OmsOrderDetail ood);
}