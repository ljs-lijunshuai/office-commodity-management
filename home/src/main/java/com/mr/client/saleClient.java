package com.mr.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("manageSale")
public interface saleClient {

}
