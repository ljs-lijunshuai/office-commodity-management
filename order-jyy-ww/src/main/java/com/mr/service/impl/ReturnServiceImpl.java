package com.mr.service.impl;

import com.alibaba.fastjson.JSON;
import com.mr.entity.OmsOrderReturnApply;
import com.mr.mapper.IReturnMapper;
import com.mr.service.IReturnService;
import com.mr.util.EsUtil;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReturnServiceImpl implements IReturnService {

    @Autowired
    private IReturnMapper iReturnMapper;
    @Autowired
    private EsUtil es;

    @Override
    public void find() {
        List<OmsOrderReturnApply> li = iReturnMapper.find(null);
        Map<String,String> indexMap = new HashMap<>();
        indexMap.put("index","oora");
        indexMap.put("type","doc");
        indexMap.put("id","1");
        /*es.addIndex(JSON.toJSONString(li),indexMap);*/
    }

    @Override
    public int deleteReturnOrder(String ids) {
        String[] arr = ids.split(",");
        return iReturnMapper.deleteReturnOrder(arr);
    }

    @Override
    public OmsOrderReturnApply findById(OmsOrderReturnApply oora) {
        return iReturnMapper.findById(oora);
    }

    @Override
    public JyyData returnOrderList(String keyword, OmsOrderReturnApply oora) {
        JyyPage j = new JyyPage();
        JyyData jd = new JyyData();
        j.setPageNum(oora.getPageNum());
        int i = (oora.getPageNum() - 1) * oora.getPageSize();
        oora.setTotalPage(i);
        //分页查询总条数
        int totalNum= iReturnMapper.findTotalNum(oora);
        //计算开始标
        /*j.calculate();*/
        //查询当前页
        List<OmsOrderReturnApply> list = iReturnMapper.find(oora);
        j.setList(list);
        j.setTotal((long) totalNum);

        j.setPageSize(oora.getPageSize());
        jd.setData(j);
        return jd;
    }
}
