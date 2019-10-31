
package com.mr.mapper;


import com.mr.entity.OmsOrder;
import com.mr.entity.OmsOrderDetail;
import com.mr.util.WwDataOod;

import java.util.List;

public interface OmsOrderMapper {

    int findTotalNum(OmsOrder omsOrder);

    List<OmsOrder> list(OmsOrder omsOrder);


    int delete(Long id);

    OmsOrderDetail detail(Long id);
}