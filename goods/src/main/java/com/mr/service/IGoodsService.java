package com.mr.service;

import com.mr.entity.PmsAlbum;
import com.mr.util.CommonResult;

public interface IGoodsService {
    CommonResult findGoodsList(PmsAlbum pmsAlbum);
}
