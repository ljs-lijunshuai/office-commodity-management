package com.mr.service.impl;

import com.mr.entity.CmsSubject;
import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.SmsHomeRecommendSubject;
import com.mr.mapper.CmsSubjectMapper;
import com.mr.page.JyyData;
import com.mr.page.JyyPage;
import com.mr.page.PageUtils;
import com.mr.page.CommonResult;
import com.mr.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SubjectServiceImpl implements ISubjectService {
   @Autowired
    private CmsSubjectMapper subjectMapper;

    /*分页查询专题全部信息 包括条件查询*/
    @Override
    public JyyData querySubjectList(String keyWord, SmsHomeRecommendSubject cmsSubject) {
        JyyPage j = new JyyPage();
        JyyData jd = new JyyData();
        j.setPageNum(cmsSubject.getPageNum());
        int i = (cmsSubject.getPageNum() - 1) * cmsSubject.getPageSize();
        cmsSubject.setTotalPage(i);//开始条数
        //分页查询总条数
        int totalNum= subjectMapper.queryTotalNum(cmsSubject);
        //计算开始标
        /*j.calculate();*/
        //查询当前页
        List<SmsHomeRecommendSubject> list = subjectMapper.queryList(cmsSubject);
        j.setList(list);
        j.setTotal((long) totalNum);

        j.setPageSize(cmsSubject.getPageSize());
        jd.setData(j);
        return jd;
    }

    /*批量修改推荐状态*/
    @Override
    public JyyData updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        JyyData retData = new JyyData();
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("ids",ids);
        paramMap.put("recommendStatus",recommendStatus);
        int status = subjectMapper.updateRecommendStatus(paramMap);
        if(status>0){
            retData.setCode(200);
            retData.setMessage("修改状态成功");
        }
        if(status<=0){
            retData.setCode(201);
            retData.setMessage("修改状态失败");
        }
        return retData;
    }




    /*@Override
    public CommonResult<PageUtils<CmsSubject>> querySubjectList(Integer pageNum, Integer pageSize) {
        *//*最终返回数据*//*
        CommonResult<PageUtils<CmsSubject>>  listData = new CommonResult<>();
        *//*分页封装数据*//*
        PageUtils<CmsSubject> pageUtils = new PageUtils<>();
        pageUtils.setPageSize(pageSize);
        pageUtils.setPageNum(pageNum);
        pageUtils.getStartNum();
        List<CmsSubject> list= subjectMapper.querySubjectList(pageUtils);
        System.out.println(list);
        pageUtils.setList(list);
        *//*总条数*//*
        Integer total = subjectMapper.querySubjectListTotalNum();
        pageUtils.setTotal(total);
        *//*总页数*//*
        pageUtils.setTotalPage(total/pageSize);
        listData.setData(pageUtils);

        listData.setCode(200);
        listData.setMessage("操作成功");
        System.out.println(listData);
        return listData;
    }*/



    /*删除*/
   /* @Override
    public Integer deleteBatchStatus(CmsSubject cmsSubject) {
        return null;
    }*/


}
