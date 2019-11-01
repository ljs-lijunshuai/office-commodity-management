package com.mr.controller;

import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.service.IReturnService;
import com.mr.util.CommonResult;
import com.mr.util.JyyClassData;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        /*iReturnService.find();*/
        System.out.println("+++++++++++++++++++++++++++==================++=====****%%%%%%%%%%%%");
        return "sss";
    }

    /**
     *@描述 分页查询
     *@参数
     *@返回值
     *@创建人 jyy
     *@创建时间 2019/10/29
     *@修改人和其它信息
     */
    @ResponseBody
    @RequestMapping(value = "/returnOrderList",method = RequestMethod.POST)
    public JyyData returnOrderList(@RequestBody OmsOrderReturnApply oora){
        String keyword=null;
        JyyData li = iReturnService.returnOrderList(oora);
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
    @RequestMapping(value = "/deleteReturnOrder",method = RequestMethod.POST)
    public CommonResult<Object> deleteReturnOrder(@RequestBody String ids){
        Integer co = null;
        int i = iReturnService.deleteReturnOrder(ids);
        if(i>0) co=200;
        return CommonResult.success(co);
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
    @RequestMapping(value="/findById",method = RequestMethod.POST)
    public JyyClassData findById(@RequestBody OmsOrderReturnApply oora){
        OmsOrderReturnApply oo = iReturnService.findById(oora);
        JyyClassData jcd = new JyyClassData();
        jcd.setData(oo);
        return jcd;
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
    public CommonResult<Object> updateReturnOrder(@RequestBody OmsUpdateStatusParam ousp){
        Integer co = null;
        int i = iReturnService.updateReturnOrder(ousp);
        if(i>0) co=200;
        return CommonResult.success(co);
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
    @RequestMapping(value = "/findCauseOrder",method = RequestMethod.POST)
    public JyyData findCauseOrder(@RequestBody OmsOrderReturnReason oorr){
        JyyData od = iReturnService.findCauseOrder(oorr);
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
    public CommonResult deleteCauseOrder(@RequestBody String ids){
        Integer co =null;
        int i = iReturnService.deleteCauseOrder(ids);
        if(i>0) co=200;
        return CommonResult.success(co);
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
        Integer co =null;
        int i = iReturnService.addCauseOrder(oorr);
        if(i>0) co=200;
        return CommonResult.success(co);
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
    public CommonResult updateInitiateMode(@RequestBody OmsOrderReturnReason oorr){
        Integer co =null;
        int i = iReturnService.updateInitiateMode(oorr);
        if(i>0) co=200;
        return CommonResult.success(co);
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
    @RequestMapping(value = "/findByCauseOrderId",method = RequestMethod.POST)
    public JyyClassData findByCauseOrderId(@RequestBody Long id){
        JyyClassData oc = iReturnService.findByCauseOrderId(id);
        return oc;
    }

    @ResponseBody
    @RequestMapping(value = "/updateCauseOrder",method = RequestMethod.POST)
    public CommonResult updateCauseOrder(@RequestBody OmsOrderReturnReason oorr){
        Integer co =null;
        int i = iReturnService.updateCauseOrder(oorr);
        if(i>0) co=200;
        return CommonResult.success(co);
    }

}


