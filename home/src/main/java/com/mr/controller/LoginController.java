package com.mr.controller;

import com.mr.client.OrderClient;
import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.entity.UmsAdmin;
import com.mr.service.IHomeService;
import com.mr.util.CommonResult;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import com.mr.util.ut.OorrClassData;
import com.mr.util.ut.OorrData;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.zip.DeflaterOutputStream;

/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private IHomeService service;
    @Autowired
    private OrderClient orderClient;


    /**
     * @Description : login登录
        * @author: 李军帅
        * @date :2019/10/25
        * @param :[]
        * @return :com.mr.util.CommonResult
        */
@ResponseBody
@RequestMapping(value = "/login", method = RequestMethod.POST)
public CommonResult login(@RequestBody UmsAdmin umsAdmin){
        System.out.println(umsAdmin.getUsername()+"----"+umsAdmin.getPassword());
        CommonResult rs = service.login(umsAdmin);
        return null;
        }

        @ResponseBody
        @RequestMapping("/test")
        public String test(){
            String test = orderClient.test();
            return test;
        }


        @ResponseBody
        @RequestMapping(value = "/returnOrderList", method = RequestMethod.GET)
        public JyyData returnOrderList(OmsOrderReturnApply oora) {
            System.out.println(oora);
            JyyData jd = (JyyData) orderClient.returnOrderList(oora);
            return jd;
        }

        }
