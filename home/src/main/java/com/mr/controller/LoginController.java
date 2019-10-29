package com.mr.controller;

import com.mr.entity.UmsAdmin;
import com.mr.service.IHomeService;
import com.mr.service.impl.HomeServiceImpl;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@Controller
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private IHomeService service;


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
        return rs;
    }

}
