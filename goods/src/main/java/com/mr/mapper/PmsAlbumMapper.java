package com.mr.mapper;


import com.mr.entity.PmsAlbum;
import com.mr.entity.PmsProduct;

import java.util.List;

public interface PmsAlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);

    List<PmsProduct> findGoodsList(PmsAlbum pmsProduct);
}