package com.mr.client;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.util.CommonResult;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import com.mr.util.ut.OorrClassData;
import com.mr.util.ut.OorrData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("manageOrder")
public interface OrderClient {

    @RequestMapping("/returnOrder/deleteReturnOrder")
    CommonResult<Object> deleteReturnOrder(String ids);

    @RequestMapping("/returnOrder/findById")
    JyyClassData findById(OmsOrderReturnApply oora);

    @RequestMapping("/returnOrder/returnOrderList")
    JyyData returnOrderList(String keyword, OmsOrderReturnApply oora);

    @RequestMapping("/returnOrder/updateReturnOrder")
    CommonResult<Object> updateReturnOrder(OmsUpdateStatusParam ousp);

    /********退货原因******8*/
    @RequestMapping("/returnOrder/findCauseOrder")
    OorrData findCauseOrder(OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/deleteCauseOrder")
    CommonResult deleteCauseOrder(String ids);

    @RequestMapping("/returnOrder/addCauseOrder")
    CommonResult<Object> addCauseOrder(OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/updateInitiateMode")
    CommonResult<Object> updateInitiateMode(OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/findByCauseOrderId")
    OorrClassData findByCauseOrderId(Long id);

    @RequestMapping("/returnOrder/updateCauseOrder")
    CommonResult<Object> updateCauseOrder(OmsOrderReturnReason oorr);


}
