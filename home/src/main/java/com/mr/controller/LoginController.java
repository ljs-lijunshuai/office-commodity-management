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
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.zip.DeflaterOutputStream;

/**
 * @Description : 登录  主页
 * @author: 李军帅
 * @date :2019/10/25
 * @param : 
 * @return :
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

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
        @RequestMapping("/test")
        public String test(){
            String test = orderClient.test();
            return test;
        }


        @ResponseBody
        @RequestMapping(value = "/returnOrderList", method = RequestMethod.GET)
        public JyyData returnOrderList(OmsOrderReturnApply oora) {
            System.out.println(oora);
            JyyData jd = orderClient.returnOrderList(oora);
            return jd;
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
    @RequestMapping(value = "/deleteReturnOrder",method = RequestMethod.POST)
    public CommonResult<Object> deleteReturnOrder(String ids){
        CommonResult i = orderClient.deleteReturnOrder(ids);
        return i;
    }

    /**
     *@描述 根据ID查询一条数据
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value="/findById",method = RequestMethod.GET)
    public JyyClassData findById(OmsOrderReturnApply oora){
        System.out.println(oora);
        JyyClassData oo = orderClient.findById(oora);
        return oo;
    }


    /**
     *@描述 退货订单的操作也就是修改
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/updateReturnOrder",method = RequestMethod.POST)
    public CommonResult<Object> updateReturnOrder(Integer id,@RequestBody OmsUpdateStatusParam ousp){
        ousp.setId((long)id);
        CommonResult i = orderClient.updateReturnOrder(ousp);
        return i;
    }

/*******************************************↓退货原因接口↓************************************************************/
    /**
     *@描述 退货原因分页查询
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/findCauseOrder",method = RequestMethod.GET)
    public JyyData findCauseOrder(OmsOrderReturnReason oorr){
        System.out.println(oorr);
        JyyData od = orderClient.findCauseOrder(oorr);
        return od;
    }

    /**
     *@描述 退货原因批量删除
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/deleteCauseOrder",method = RequestMethod.POST)
    public CommonResult deleteCauseOrder(String ids){
        CommonResult i = orderClient.deleteCauseOrder(ids);
        return i;
    }

    /**
     *@描述 退货原因添加接口
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/addCauseOrder",method = RequestMethod.POST)
    public CommonResult addCauseOrder(@RequestBody OmsOrderReturnReason oorr){
        CommonResult i = orderClient.addCauseOrder(oorr);
        return i;
    }
    /**
     *@描述 修改改按钮启用状态
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/updateInitiateMode",method = RequestMethod.POST)
    public CommonResult updateInitiateMode(OmsOrderReturnReason oorr,Long ids){
        oorr.setId(ids);
        CommonResult i = orderClient.updateInitiateMode(oorr);
        return i;
    }
    /**
     *@描述 单条数据查询
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/findByCauseOrderId",method = RequestMethod.GET)
    public JyyClassData findByCauseOrderId(Long id){
        JyyClassData oc = orderClient.findByCauseOrderId(id);
        return oc;
    }

    @ResponseBody
    @RequestMapping(value = "/updateCauseOrder",method = RequestMethod.POST)
    public CommonResult updateCauseOrder(@RequestBody OmsOrderReturnReason oorr){
        CommonResult i = orderClient.updateCauseOrder(oorr);
        return i;
    }







}
