package com.mr.service.impl;

import com.mr.entity.PmsProduct;
import com.mr.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private PmsProduct pmsProduct;
}
