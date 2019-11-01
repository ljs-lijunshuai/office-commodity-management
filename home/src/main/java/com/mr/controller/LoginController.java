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
import org.springframework.web.bind.annotation.*;

/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@RestController
@RequestMapping("/admin")
public class LoginController{

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
    @RequestMapping("deleteReturnOrder")
    public CommonResult<Object> deleteReturnOrder(String ids) {
        return orderClient.deleteReturnOrder(ids);
    }

    @ResponseBody
    @RequestMapping("findById")
    public JyyClassData findById(OmsOrderReturnApply oora) {
        return orderClient.findById(oora);
    }

    /*退货订单查询*/
    @ResponseBody
    @RequestMapping("/returnOrderList")
    public JyyData returnOrderList(@RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize ,@RequestParam(value = "pageNum",required = false) Integer pageNum) {
        System.out.println(pageNum+"---------"+pageSize);
        JyyData jyyData = orderClient.returnOrderList(pageSize,pageNum);
        return jyyData;
    }


    /*修改*/
    @ResponseBody
    @RequestMapping("updateReturnOrder")
    public CommonResult<Object> updateReturnOrder(OmsUpdateStatusParam ousp) {

        return orderClient.updateReturnOrder(ousp);
    }

    @ResponseBody
    @RequestMapping("findCauseOrder")
    public OorrData findCauseOrder(OmsOrderReturnReason oorr) {
        return orderClient.findCauseOrder(oorr);
    }

    @ResponseBody
    @RequestMapping("deleteCauseOrder")
    public CommonResult deleteCauseOrder(String ids) {
        return orderClient.deleteCauseOrder(ids);
    }

    @ResponseBody
    @RequestMapping("addCauseOrder")
    public CommonResult<Object> addCauseOrder(OmsOrderReturnReason oorr) {
        return orderClient.addCauseOrder(oorr);
    }

    @ResponseBody
    @RequestMapping("updateInitiateMode")
    public CommonResult<Object> updateInitiateMode(OmsOrderReturnReason oorr) {
        return orderClient.updateInitiateMode(oorr);
    }

    @ResponseBody
    @RequestMapping("findByCauseOrderId")
    public OorrClassData findByCauseOrderId(Long id) {
        return orderClient.findByCauseOrderId(id);
    }

    @ResponseBody
    @RequestMapping("updateCauseOrder")
    public CommonResult<Object> updateCauseOrder(OmsOrderReturnReason oorr) {
        return orderClient.updateCauseOrder(oorr);
    }
}
