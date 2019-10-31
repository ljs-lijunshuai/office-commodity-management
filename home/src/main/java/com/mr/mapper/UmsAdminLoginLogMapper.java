package com.mr.mapper;


import com.mr.entity.UmsAdmin;
import com.mr.entity.UmsAdminLoginLog;

public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);

    /*UmsAdmin findUserName(UmsAdmin umsAdmin);*/
}