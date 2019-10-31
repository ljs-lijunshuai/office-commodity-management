package com.mr.service.impl;

import com.github.pagehelper.PageHelper;
import com.mr.entity.SmsFlashPromotion;
import com.mr.entity.SmsFlashPromotionSession;
import com.mr.mapper.SmsFlashPromotionMapper;
import com.mr.mapper.SmsFlashPromotionSessionMapper;
import com.mr.service.IPromotionService;
import com.mr.util.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PromotionServiceImpl implements IPromotionService {

    //注入秒杀表mapper
    @Autowired
    private SmsFlashPromotionMapper SmsFlashPromotionMapper;

    //注入限时购场次表mapper
    @Autowired
    private SmsFlashPromotionSessionMapper SmsFlashPromotionSessionMapper;

    //查询秒杀表 不带分页的
   /* @Override
    public List<SmsFlashPromotion> queryPromotionList() {
        return SmsFlashPromotionMapper.queryPromotionList();
    }
*/
    //查询秒杀表
    @Override
    public Map<String,Object> queryPromotionList(SmsFlashPromotion smsFlashPromotion,String keyword, Integer pageSize, Integer pageNum) {
        DataGrid dg = new DataGrid();
       // dg.setTotal(10);//总条数
        //dg.setPageSize(5);//一页几条
        //dg.setTotalPage(1);//第几页

        //查询总条数
        int total = SmsFlashPromotionMapper.queryTotal(smsFlashPromotion);
        dg.setTotal(total);

        smsFlashPromotion.setRows(pageSize);
        smsFlashPromotion.setPage(pageNum);
        //计算开始下标
        smsFlashPromotion.setStartPos((smsFlashPromotion.getPage()-1)*smsFlashPromotion.getRows());

        //当前信息
        List<SmsFlashPromotion> list = SmsFlashPromotionMapper.queryPromotionList(smsFlashPromotion);
        dg.setList(list);

        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("data",dg);

        return map;
    }

    //秒杀表删除
    @Override
    public int deletePromotionInfo(Integer id) {
        return SmsFlashPromotionMapper.deletePromotionInfo(id);
    }

    //限时购场次表查询
    @Override
    public List<SmsFlashPromotionSession> queryProSessionList() {
        return SmsFlashPromotionSessionMapper.queryProSessionList();
    }

    //限时购场次表 删除
    @Override
    public int deleteProSessionInfo(Integer id) {
        return SmsFlashPromotionSessionMapper.deleteProSessionInfo(id);
    }
    //限时购场次表 添加
    @Override
    public int addProSessionInfo(SmsFlashPromotionSession smsFlashPromotionSession) {
        return SmsFlashPromotionSessionMapper.addProSessionInfo(smsFlashPromotionSession);
    }
}
