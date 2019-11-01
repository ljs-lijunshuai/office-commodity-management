package com.mr.client;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.util.CommonResult;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import com.mr.util.ut.OorrClassData;
import com.mr.util.ut.OorrData;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("manage-order")
public interface OrderClient {

    @RequestMapping("/returnOrder/test")
    String test();

    @RequestMapping(value="/returnOrder/returnOrderList",method = RequestMethod.POST)
    JyyData returnOrderList(OmsOrderReturnApply oora);


}