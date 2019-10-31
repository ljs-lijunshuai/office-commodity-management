package com.mr.service;

import com.mr.entity.CmsSubject;
import com.mr.entity.SmsHomeRecommendSubject;
import com.mr.page.CommonResult;
import com.mr.page.JyyData;
import com.mr.page.PageUtils;
import com.mr.result.CommonPage;

import java.util.List;

public interface ISubjectService {
    /*分页查询专题全部信息 包括条件查询*/
    JyyData querySubjectList(String keyWord, SmsHomeRecommendSubject cmsSubject);

    /*批量修改推荐状态*/
    JyyData updateRecommendStatus(List<Long> ids, Integer recommendStatus);
    /*CommonResult<PageUtils<CmsSubject>> querySubjectList(Integer pageNum, Integer pageSize);*/
    /**
     * @Description:querySubjectList 查询全部主题信息
     * @author: yw
     * @date: 2019/10/28
     * @param: [cmsSubject]
     * @return: java.util.List<com.mr.entity.CmsSubject>
     */
   /* List<CmsSubject> querySubjectList(CmsSubject cmsSubject);*/


    /**
     * @Description:deleteBatchStatus   删除
     * @author: yw
     * @date: 2019/10/28
     * @param: [cmsSubject]
     * @return: com.mr.util.CommonResult
     */
    /*Integer deleteBatchStatus(CmsSubject cmsSubject);*/
}
