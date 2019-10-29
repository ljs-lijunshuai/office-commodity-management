package com.mr.controller;

import com.mr.entity.OmsOrder;
import com.mr.service.IOmsOrderService;
import com.mr.util.DataGridWw;
import com.mr.util.WwData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OmsOrderController {

    @Autowired
    private IOmsOrderService orderService;

    @GetMapping("/list")
    @ResponseBody
    public WwData list(String keyword,OmsOrder omsOrder){
        WwData ww = orderService.list(keyword,omsOrder);
        return ww;
    }
}
