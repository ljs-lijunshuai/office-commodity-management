package com.mr.controller;

import com.mr.entity.PmsAlbum;
import com.mr.entity.PmsProduct;
import com.mr.service.IGoodsService;
import com.mr.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description : 商品模块
 * @author: 李军帅
 * @date :2019/10/28
 * @param : 
 * @return :
 */
@Controller
@RequestMapping("product")
public class GoodsController {

    /*注入service*/
    @Autowired
    private IGoodsService goodsService;

    /**
     * @Description : findGoodsList 查询所有商品信息
     * @author: 李军帅
     * @date :2019/10/28
     * @param :[]
     * @return :com.mr.util.CommonResult
     */
    @ResponseBody
    @RequestMapping("list")
    public CommonResult findGoodsList(@RequestBody PmsAlbum pmsAlbum){
        CommonResult cr = goodsService.findGoodsList(pmsAlbum);
        return cr;
    }

}
