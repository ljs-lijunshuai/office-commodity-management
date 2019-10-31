package com.mr.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("manageGoods")
public interface GoodsClient {



}
