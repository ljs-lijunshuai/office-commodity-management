package com.mr.client;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.util.CommonResult;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("manage-order")
public interface OrderClient {

    @RequestMapping("/returnOrder/test")
    String test();

    @RequestMapping(value="/returnOrder/returnOrderList",method = RequestMethod.POST)
    JyyData returnOrderList(OmsOrderReturnApply oora);

    @RequestMapping(value="/returnOrder/deleteReturnOrder",method = RequestMethod.POST)
    CommonResult deleteReturnOrder(String ids);

    @RequestMapping(value="/returnOrder/findById",method = RequestMethod.POST)
    JyyClassData findById(OmsOrderReturnApply oora);

    @RequestMapping(value="/returnOrder/updateReturnOrder",method = RequestMethod.POST)
    CommonResult updateReturnOrder(OmsUpdateStatusParam ousp);

    /******************************************退货原因************************************************8*/

    @RequestMapping(value="/returnOrder/findCauseOrder",method = RequestMethod.POST)
    JyyData findCauseOrder(OmsOrderReturnReason oorr);

    @RequestMapping(value="/returnOrder/deleteCauseOrder",method = RequestMethod.POST)
    CommonResult deleteCauseOrder(String ids);

    @RequestMapping(value="/returnOrder/addCauseOrder",method = RequestMethod.POST)
    CommonResult addCauseOrder(OmsOrderReturnReason oorr);

    @RequestMapping(value="/returnOrder/updateInitiateMode",method = RequestMethod.POST)
    CommonResult updateInitiateMode(OmsOrderReturnReason oorr);

    @RequestMapping(value="/returnOrder/findByCauseOrderId",method = RequestMethod.POST)
    JyyClassData findByCauseOrderId(Long id);

    @RequestMapping(value="/returnOrder/updateCauseOrder",method = RequestMethod.POST)
    CommonResult updateCauseOrder(OmsOrderReturnReason oorr);


}