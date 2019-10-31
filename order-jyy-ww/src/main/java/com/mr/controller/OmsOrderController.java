package com.mr.controller;

import com.mr.entity.OmsOrder;
import com.mr.entity.OmsOrderDetail;
import com.mr.entity.OmsOrderOperateHistory;
import com.mr.service.IOmsOrderService;
import com.mr.util.CommonResult;
import com.mr.util.WwData;
import com.mr.util.WwDataOod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OmsOrderController {

    @Autowired
    private IOmsOrderService orderService;
    /**Template text:
     * @MethodName: list
     * @Description: 数据列表
     * @Param: [keyword, omsOrder]
     * @Return: com.mr.util.WwData
     * @Author: ww
     * @Date: 2019/10/29 11:31
    **/
    @GetMapping("/list")
    @ResponseBody
    public WwData list(String keyword,OmsOrder omsOrder){
        WwData ww = orderService.list(keyword,omsOrder);
        return ww;
    }

    /**Template text:
     * @MethodName: delivery
     * @Description: 批量发货
     * @Param: [omstory]
     * @Return: com.mr.util.WwData
     * @Author: ww
     * @Date: 2019/10/29 14:36
    **/
    @PostMapping("/update/delivery")
    @ResponseBody
    public WwData delivery(OmsOrderOperateHistory omstory){
      /* int count = orderService.delivery(omstory);
       if(count>0){
           return WwData.success(count);
       }
        return WwData.failed();*/
      return null;
    }

    /**Template text:
     * @MethodName: detail
     * @Description: 获取订单详情
     * @Param: [id]
     * @Return: com.mr.entity.OmsOrderDetail
     * @Author: ww
     * @Date: 2019/10/29 20:25 
    **/
    @RequestMapping("/detail")
    @ResponseBody
    public CommonResult<OmsOrderDetail> detail(Long id) {
        OmsOrderDetail orderDetailResult = orderService.detail(id);
        return CommonResult.success(orderDetailResult);
    }

    @ResponseBody
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") Long ids){
        Integer co =null;
        int i = orderService.delete(ids);
        if(i>0) co=200;
        return CommonResult.success(co);
    }

}
