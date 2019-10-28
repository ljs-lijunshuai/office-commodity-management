package com.mr.service.impl;

import com.alibaba.fastjson.JSON;
import com.mr.entity.OmsOrderReturnApply;
import com.mr.mapper.IReturnMapper;
import com.mr.service.IReturnService;
import com.mr.util.EsUtil;
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
        List<OmsOrderReturnApply> li = iReturnMapper.find();
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
}
