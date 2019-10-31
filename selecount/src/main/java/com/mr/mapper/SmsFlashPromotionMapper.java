package com.mr.mapper;


import com.mr.entity.SmsFlashPromotion;
import com.mr.entity.SmsFlashPromotionSession;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SmsFlashPromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);

    //查询秒杀表总条数
    int queryTotal(SmsFlashPromotion smsFlashPromotion);

    //查询秒杀表全部
    List<SmsFlashPromotion> queryPromotionList(SmsFlashPromotion smsFlashPromotion);



    //秒杀表删除
    int deletePromotionInfo(Integer id);
}