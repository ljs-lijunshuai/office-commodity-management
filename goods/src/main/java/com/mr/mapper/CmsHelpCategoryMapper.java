package com.mr.mapper;


import com.mr.entity.CmsHelpCategory;

public interface CmsHelpCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);
}