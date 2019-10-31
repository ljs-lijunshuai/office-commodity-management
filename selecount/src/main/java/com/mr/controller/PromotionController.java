package com.mr.controller;

import com.mr.entity.SmsFlashPromotion;
import com.mr.entity.SmsFlashPromotionSession;
import com.mr.service.IPromotionService;
import com.mr.util.CommonPage;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("promotion")
public class PromotionController {

    //注入
    @Autowired
    private IPromotionService promotionSer;

    //查询秒杀表
    @GetMapping("/queryPromotionList")
    @ResponseBody
    public Map<String,Object> queryPromotionList(SmsFlashPromotion smsFlashPromotion,String keyword, Integer pageSize, Integer pageNum){
        Map<String,Object> map = promotionSer.queryPromotionList(smsFlashPromotion,keyword,pageSize,pageNum);
        return map;
    }
    //秒杀表的删除
    @ResponseBody
    @PostMapping("/deletePromotionInfo/{id}")
    public CommonResult deletePromotionInfo(@PathVariable Integer id){
        System.out.println(id);
        int flag = promotionSer.deletePromotionInfo(id);
        if(flag!=0){ //删除成功
            return CommonResult.success(flag);
        }
        return CommonResult.failed();
    }




    //限时购场次表查询
    @ResponseBody
    @GetMapping("/queryProSessionList")
    public List<SmsFlashPromotionSession> queryProSessionList(){
        List<SmsFlashPromotionSession> list = promotionSer.queryProSessionList();
        return list;
    }
    //限时购场次表的删除
    @ResponseBody
    @GetMapping("/deleteProSessionInfo")
    public CommonResult deleteProSessionInfo(Integer id){
        int flag = promotionSer.deleteProSessionInfo(id);
        if(flag!=0){ //删除成功
            return CommonResult.success(flag);
        }
        return CommonResult.failed();
    }
    //限时购场次表的新增
    @ResponseBody
    @PostMapping("/addProSessionInfo")
    public CommonResult addProSessionInfo(SmsFlashPromotionSession smsFlashPromotionSession){
        int flag = promotionSer.addProSessionInfo(smsFlashPromotionSession);
        if(flag!=0){ //添加成功
            return CommonResult.success(flag);
        }
        return CommonResult.failed();
    }






}
