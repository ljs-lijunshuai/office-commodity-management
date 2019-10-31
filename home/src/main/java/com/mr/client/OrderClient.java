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
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("manageOrder")
public interface OrderClient {

    @RequestMapping("/returnOrder/deleteReturnOrder")
    CommonResult<Object> deleteReturnOrder(@RequestParam("ids") String ids);

    @RequestMapping("/returnOrder/findById")
    JyyClassData findById(@RequestParam("oora") OmsOrderReturnApply oora);

    @RequestMapping("/returnOrder/returnOrderList")
    JyyData returnOrderList(@RequestParam("keyword") String keyword,@RequestParam("keyword") OmsOrderReturnApply oora);

    @RequestMapping("/returnOrder/updateReturnOrder")
    CommonResult<Object> updateReturnOrder(@RequestParam("ousp") OmsUpdateStatusParam ousp);

    /********退货原因******8*/
    @RequestMapping("/returnOrder/findCauseOrder")
    OorrData findCauseOrder(@RequestParam("oorr") OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/deleteCauseOrder")
    CommonResult deleteCauseOrder(@RequestParam("ids") String ids);

    @RequestMapping("/returnOrder/addCauseOrder")
    CommonResult<Object> addCauseOrder(@RequestParam("oorr") OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/updateInitiateMode")
    CommonResult<Object> updateInitiateMode(@RequestParam("oorr") OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/findByCauseOrderId")
    OorrClassData findByCauseOrderId(@RequestParam("id") Long id);

    @RequestMapping("/returnOrder/updateCauseOrder")
    CommonResult<Object> updateCauseOrder(@RequestParam("oorr") OmsOrderReturnReason oorr);


}
