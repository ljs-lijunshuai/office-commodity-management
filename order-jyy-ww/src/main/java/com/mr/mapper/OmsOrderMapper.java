
package com.mr.mapper;


import com.mr.entity.OmsOrder;

import java.util.List;

public interface OmsOrderMapper {

    int findTotalNumx(OmsOrder omsOrder);

    List<OmsOrder> list(OmsOrder omsOrder);
}