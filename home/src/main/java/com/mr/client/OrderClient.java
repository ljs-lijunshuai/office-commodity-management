package com.mr.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("manageOrder")
public interface OrderClient {

    @RequestMapping("/test/test")
    String add (@RequestParam("ids") String ids);

}
