package com.mr.controller;

import com.mr.mapper.IReturnMapper;
import com.mr.service.IReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ReturnController {

    @Autowired
    private IReturnService iReturnService;
    
    /**
     *@描述 
     *@参数 
     *@返回值 
     *@创建人 jyy
     *@创建时间 2019/10/27
     *@修改人和其它信息
     */
    @RequestMapping("/test")
    public String test(String ids){
        System.out.println(ids);
        return "sss";
    }

    @RequestMapping("/list")
    public void lsit(){

    }
}


