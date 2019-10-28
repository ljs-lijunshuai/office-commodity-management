package com.mr.controller;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.service.IReturnService;
import com.mr.util.CommonResult;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/returnOrder")
public class ReturnController {

    @Autowired
    private IReturnService iReturnService;
    
    /**
     *@描述:查询全部数据存入ES
     *@参数 
     *@返回值 
     *@创建人 jyy
     *@创建时间 2019/10/27
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        iReturnService.find();
        return "sss";
    }

    @ResponseBody
    @RequestMapping("/returnOrderList")
    public JyyData returnOrderList(String keyword,OmsOrderReturnApply oora){
        JyyData li = iReturnService.returnOrderList(keyword,oora);
        return li;
    }

    /**
     *@描述 批量删除
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/28
     *@修改人和其它信息
     */
    @ResponseBody
    @PostMapping("/deleteReturnOrder")
    public CommonResult<Object> deleteReturnOrder(String ids){
        Integer co = null;
        int i = iReturnService.deleteReturnOrder(ids);
        if(i>0) co=200;
        return CommonResult.success(co);
    }

    @ResponseBody
    @PostMapping("/findById")
    public OmsOrderReturnApply findById(OmsOrderReturnApply oora){
        return iReturnService.findById(oora);
    }




}


