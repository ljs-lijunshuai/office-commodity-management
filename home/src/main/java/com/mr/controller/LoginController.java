package com.mr.controller;

import com.mr.client.OrderClient;
import com.mr.entity.UmsAdmin;
import com.mr.service.impl.HomeServiceImpl;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@RestController()
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private HomeServiceImpl service;


    @Autowired
    private OrderClient orderClient;


    @RequestMapping("test")
    public String  test(){
        return orderClient.add("a");
    }



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
        System.out.println(umsAdmin);
        return null;
    }

}
