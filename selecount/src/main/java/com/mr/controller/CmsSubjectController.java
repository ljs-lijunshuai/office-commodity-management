package com.mr.controller;

import com.mr.entity.CmsSubject;
import com.mr.entity.SmsHomeRecommendSubject;
import com.mr.page.CommonResult;
import com.mr.page.JyyData;
import com.mr.page.PageUtils;
import com.mr.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home/recommendSubject")
public class CmsSubjectController {

    @Autowired
    private ISubjectService subjectService;

    /*查询主题*/
   /* @ResponseBody
    @GetMapping("/querySubjectList")
    public CommonResult<PageUtils<CmsSubject>> querySubjectList(CmsSubject cmsSubject,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        *//*List<CmsSubject> list = subjectService.querySubjectList(cmsSubject);*//*
        return subjectService.querySubjectList(pageNum,pageSize);
    }*/

    /*分页查询专题全部信息 包括条件查询*/
    @ResponseBody
    @GetMapping("/querySubjectList")
    public JyyData querySubjectList(String keyWord,SmsHomeRecommendSubject cms){
        return subjectService.querySubjectList(keyWord,cms);
    }
    /*批量修改推荐状态*/
    @RequestMapping(value = "/updateRecommendStatus", method = RequestMethod.POST)
    @ResponseBody
    public JyyData updateRecommendStatus(@RequestParam("ids") List<Long> ids, @RequestParam Integer recommendStatus){
        return subjectService.updateRecommendStatus(ids,recommendStatus);
    }
   /*删除*/
//    public CommonResult deleteBatchStatus(CmsSubject cmsSubject){
//        Integer delStatus = subjectService.deleteBatchStatus(cmsSubject);
//        Map<String,Object> retMap = new HashMap<>();
//        return CommonResult.success(CommonPage.restPage());
//    }


}
