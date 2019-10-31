package com.mr.mapper;

import com.mr.entity.CmsSubject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ITestCmsSubjectMapper {
    List<CmsSubject> quertTest();
}
