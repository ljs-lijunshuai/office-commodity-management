package com.mr.service.impl;

import com.mr.entity.UmsAdmin;
import com.mr.mapper.UmsAdminMapper;
import com.mr.service.IHomeService;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
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
        CommonResult cr = new CommonResult();
        /*根据用户名查询*/
        if (umsAdmin.getUsername()==null&&umsAdmin.getPassword()==null){
            cr.setCode(500);
            cr.setMessage("账号不存在");
            cr.setData(null);
            return cr;
        }
        UmsAdmin ua =  umsAdminMapper.findUserName(umsAdmin);
        if (ua==null){
            cr.setCode(500);
            cr.setMessage("账号不存在");
            cr.setData(null);
            return cr;
        }

        return null;
    }

}

