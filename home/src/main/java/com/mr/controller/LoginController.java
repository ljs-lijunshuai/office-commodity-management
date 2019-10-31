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
public class LoginController implements OrderClient {

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
        return null;
    }

    @ResponseBody
    @RequestMapping("deleteReturnOrder")
    @Override
    public CommonResult<Object> deleteReturnOrder(String ids) {
        return null;
    }

    @ResponseBody
    @RequestMapping("findById")
    @Override
    public JyyClassData findById(OmsOrderReturnApply oora) {
        return null;
    }

    @ResponseBody
    @RequestMapping("returnOrderList")
    @Override
    public JyyData returnOrderList(String keyword, OmsOrderReturnApply oora) {
        return null;
    }

    @ResponseBody
    @RequestMapping("updateReturnOrder")
    @Override
    public CommonResult<Object> updateReturnOrder(OmsUpdateStatusParam ousp) {
        return null;
    }

    @ResponseBody
    @RequestMapping("findCauseOrder")
    @Override
    public OorrData findCauseOrder(OmsOrderReturnReason oorr) {
        return null;
    }

    @ResponseBody
    @RequestMapping("deleteCauseOrder")
    @Override
    public CommonResult deleteCauseOrder(String ids) {
        return null;
    }

    @ResponseBody
    @RequestMapping("addCauseOrder")
    @Override
    public CommonResult<Object> addCauseOrder(OmsOrderReturnReason oorr) {
        return null;
    }

    @ResponseBody
    @RequestMapping("updateInitiateMode")
    @Override
    public CommonResult<Object> updateInitiateMode(OmsOrderReturnReason oorr) {
        return null;
    }

    @ResponseBody
    @RequestMapping("findByCauseOrderId")
    @Override
    public OorrClassData findByCauseOrderId(Long id) {
        return null;
    }

    @ResponseBody
    @RequestMapping("updateCauseOrder")
    @Override
    public CommonResult<Object> updateCauseOrder(OmsOrderReturnReason oorr) {
        return null;
    }
}
