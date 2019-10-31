package com.mr.service.impl;

import com.mr.entity.UmsAdmin;
import com.mr.mapper.UmsAdminLoginLogMapper;
import com.mr.mapper.UmsAdminMapper;
import com.mr.service.IHomeService;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;


    /**
     * @Description : login 登录y
     * @author: 李军帅
     * @date :2019/10/28
     * @param :[umsAdmin]
     * @return :com.mr.util.CommonResult
     */
    @Override
    public CommonResult login(UmsAdmin umsAdmin) {
        /*根据用户名查询*/
        UmsAdmin ua =  umsAdminMapper.findUserName(umsAdmin);
        return null;
    }

}

