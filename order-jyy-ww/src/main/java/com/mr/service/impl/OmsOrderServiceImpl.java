package com.mr.service.impl;

import com.mr.entity.OmsOrder;
import com.mr.mapper.OmsOrderMapper;
import com.mr.service.IOmsOrderService;
import com.mr.util.WwData;
import com.mr.util.WwPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OmsOrderServiceImpl implements IOmsOrderService {

    @Autowired
    private OmsOrderMapper orderMapper;

    @Override
    public WwData list(String keyword, OmsOrder omsOrder) {
        WwPage w = new WwPage();
        WwData ww = new WwData();
        w.setPageNum(omsOrder.getPageNum());
        int i = (omsOrder.getPageNum() - 1) * omsOrder.getPageSize();
        omsOrder.setTotalPage(i);
        //分页查询总条数
        int totalNum= orderMapper.findTotalNumx(omsOrder);
        //计算开始标
        /*j.calculate();*/
        //查询当前页
        List<OmsOrder> list = orderMapper.list(omsOrder);
        w.setList(list);
        w.setTotal((long) totalNum);

        w.setPageSize(omsOrder.getPageSize());
        ww.setData(w);
        return ww;
    }
}
