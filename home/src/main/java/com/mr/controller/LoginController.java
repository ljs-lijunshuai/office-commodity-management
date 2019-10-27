package com.mr.controller;

import com.mr.service.impl.HomeServiceImpl;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@RestController()
@RequestMapping("home")
public class LoginController {

    @Autowired
    private HomeServiceImpl service;

    @RequestMapping("test")
    public String  test(){
        return "hahahahahah";
    }



    /**
     * @Description : login登录
     * @author: 李军帅
     * @date :2019/10/25
     * @param :[]
     * @return :com.mr.util.CommonResult
     */
    public CommonResult login(){
        return null;
    }

}
