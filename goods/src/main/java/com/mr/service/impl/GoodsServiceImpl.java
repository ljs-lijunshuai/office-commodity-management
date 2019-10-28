package com.mr.service.impl;

import com.mr.entity.PmsProduct;
import com.mr.service.IGoodsService;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private PmsProduct pmsProduct;

    /**
     * @Description : findGoodsList
     * @author: 李军帅
     * @date :2019/10/28
     * @param :[]
     * @return :com.mr.util.CommonResult
     */
    @Override
    public CommonResult findGoodsList() {


        return null;
    }
}
