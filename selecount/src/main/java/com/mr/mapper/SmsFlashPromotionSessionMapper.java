package com.mr.mapper;


import com.mr.entity.SmsFlashPromotionSession;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SmsFlashPromotionSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);



    //限时购场次表查询
    List<SmsFlashPromotionSession> queryProSessionList();

    //限时购场次表删除
    int deleteProSessionInfo(Integer id);

    //限时购场次表添加
    int addProSessionInfo(SmsFlashPromotionSession smsFlashPromotionSession);


}