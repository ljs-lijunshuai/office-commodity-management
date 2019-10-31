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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@FeignClient("manageOrder")
public interface OrderClient {

    @RequestMapping("/returnOrder/deleteReturnOrder")
    CommonResult<Object> deleteReturnOrder(String ids);

    @RequestMapping("/returnOrder/findById")
    JyyClassData findById(@RequestParam OmsOrderReturnApply oora);

    @RequestMapping("/returnOrder/returnOrderList")
    JyyData returnOrderList(@RequestParam(required = false)Integer pageSize ,@RequestParam(required = false)Integer pageNum);

    @RequestMapping("/returnOrder/updateReturnOrder")
    CommonResult<Object> updateReturnOrder(@RequestParam OmsUpdateStatusParam ousp);

    /********退货原因******8*/
    @RequestMapping("/returnOrder/findCauseOrder")
    OorrData findCauseOrder(@RequestParam OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/deleteCauseOrder")
    CommonResult deleteCauseOrder(@RequestParam("ids") String ids);

    @RequestMapping("/returnOrder/addCauseOrder")
    CommonResult<Object> addCauseOrder(@RequestParam OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/updateInitiateMode")
    CommonResult<Object> updateInitiateMode(@RequestParam OmsOrderReturnReason oorr);

    @RequestMapping("/returnOrder/findByCauseOrderId")
    OorrClassData findByCauseOrderId(@RequestParam("id") Long id);

    @RequestMapping("/returnOrder/updateCauseOrder")
    CommonResult<Object> updateCauseOrder(@RequestParam OmsOrderReturnReason oorr);


}
