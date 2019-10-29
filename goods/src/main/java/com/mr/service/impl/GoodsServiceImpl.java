package com.mr.service.impl;

import com.mr.entity.PmsAlbum;
import com.mr.entity.PmsProduct;
import com.mr.mapper.PmsAlbumMapper;
import com.mr.service.IGoodsService;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private PmsAlbumMapper pmsAlbumMapper;

    /**
     * @Description : findGoodsList
     * @author: 李军帅
     * @date :2019/10/28
     * @param :[]
     * @return :com.mr.util.CommonResult
     */
    @Override
    public CommonResult findGoodsList(PmsAlbum pmsAlbum) {
        List<PmsProduct> list = pmsAlbumMapper.findGoodsList(pmsAlbum);

        return null;
    }
}
