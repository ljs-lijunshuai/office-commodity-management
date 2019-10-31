package com.mr.service;

import com.mr.entity.SmsFlashPromotion;
import com.mr.entity.SmsFlashPromotionSession;

import java.util.List;
import java.util.Map;

public interface IPromotionService{
    //查询秒杀表
    Map<String,Object> queryPromotionList(SmsFlashPromotion smsFlashPromotion,String keyword, Integer pageSize, Integer pageNum);
    //List<SmsFlashPromotion> queryPromotionList();  不带分页

    //秒杀表删除
    int deletePromotionInfo(Integer id);

    //限时购场次表查询
    List<SmsFlashPromotionSession> queryProSessionList();

    //限时购场次表删除
    int deleteProSessionInfo(Integer id);

    //限时购场次表添加
    int addProSessionInfo(SmsFlashPromotionSession smsFlashPromotionSession);



}
