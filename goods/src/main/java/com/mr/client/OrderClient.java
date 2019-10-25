package com.mr.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("manageOrder")
public interface OrderClient {
}
