package com.mr.mapper;


import com.mr.entity.CmsSubject;
import com.mr.entity.SmsHomeRecommendSubject;

import java.util.List;
import java.util.Map;

public interface CmsSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);


   
   /* List<CmsSubject> querySubjectList(CmsSubject cmsSubject);*/



    /*int querySubjectListTotalNum(CmsSubject cmsSubject);*/

    int deleteBatchStatus(List<String> ids);

    /*List<CmsSubject> querySubjectList(PageUtils<CmsSubject> pageUtils);

    Integer querySubjectListTotalNum();*/

    /*分页查询专题全部信息 包括条件查询*/
    List<SmsHomeRecommendSubject> queryList(SmsHomeRecommendSubject cmsSubject);

    /*分页查询专题全部信息 查询总条数*/
    int queryTotalNum(SmsHomeRecommendSubject cmsSubject);

    /*批量修改推荐状态*/
    int updateRecommendStatus(Map<String, Object> paramMap);
}