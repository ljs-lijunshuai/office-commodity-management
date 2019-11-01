package com.mr.service.impl;

import com.alibaba.fastjson.JSON;
import com.mr.entity.OmsOrderReturnApply;
import com.mr.entity.OmsOrderReturnReason;
import com.mr.entity.OmsUpdateStatusParam;
import com.mr.mapper.IReturnMapper;
import com.mr.service.IReturnService;
import com.mr.util.EsUtil;
import com.mr.util.JyyData;
import com.mr.util.JyyPage;
import com.mr.util.ut.OorrClassData;
import com.mr.util.ut.OorrData;
import com.mr.util.ut.OorrPage;
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
    public JyyData returnOrderList(OmsOrderReturnApply oora) {
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
        jd.setCode(200);
        j.setPageSize(oora.getPageSize());
        jd.setData(j);
        return jd;
    }

    @Override
    public int updateReturnOrder(OmsUpdateStatusParam ousp) {
        return iReturnMapper.updateReturnOrder(ousp);
    }

    /*******************************************************************************************/

    @Override
    public OorrData findCauseOrder(OmsOrderReturnReason oorr) {

        OorrPage op = new OorrPage();
        OorrData od = new OorrData();
        op.setPageNum(oorr.getPageNum());
        int i = (oorr.getPageNum() - 1) * oorr.getPageSize();
        oorr.setTotalPage(i);
        //分页查询总条数
        int totalNum= iReturnMapper.findCauseTotalNum(oorr);
        //计算开始标
        /*j.calculate();*/
        //查询当前页
        List<OmsOrderReturnReason> list = iReturnMapper.findCause(oorr);
        op.setList(list);
        op.setTotal((long) totalNum);

        op.setPageSize(oorr.getPageSize());
        od.setData(op);
        return od;
    }

    @Override
    public int deleteCauseOrder(String ids) {
        String[] arr = ids.split(",");
        return iReturnMapper.deleteCauseOrder(arr);
    }

    @Override
    public int addCauseOrder(OmsOrderReturnReason oorr) {
        return iReturnMapper.addCauseOrder(oorr);
    }

    @Override
    public int updateInitiateMode(OmsOrderReturnReason oorr) {
        return iReturnMapper.updateInitiateMode(oorr);
    }

    @Override
    public OorrClassData findByCauseOrderId(Long id) {
        OmsOrderReturnReason or = iReturnMapper.findByCauseOrderId(id);
        OorrClassData ocd = new OorrClassData();
        ocd.setData(or);
        return ocd;
    }

    @Override
    public int updateCauseOrder(OmsOrderReturnReason oorr) {
        return iReturnMapper.updateCauseOrder(oorr);
    }
}
