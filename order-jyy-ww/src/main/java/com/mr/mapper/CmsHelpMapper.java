package com.mr.mapper;


import com.mr.entity.CmsHelp;

public interface CmsHelpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    int insertSelective(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelp record);

    int updateByPrimaryKeyWithBLOBs(CmsHelp record);

    int updateByPrimaryKey(CmsHelp record);
}