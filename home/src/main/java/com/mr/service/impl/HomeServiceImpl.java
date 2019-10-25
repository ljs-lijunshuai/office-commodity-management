package com.mr.service.impl;

import com.mr.mapper.UmsAdminLoginLogMapper;
import com.mr.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;
}
