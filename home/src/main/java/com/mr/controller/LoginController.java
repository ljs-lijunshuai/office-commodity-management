package com.mr.controller;

import com.mr.service.impl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@RestController("home")
public class LoginController {

    @Autowired
    private HomeServiceImpl service;

}
