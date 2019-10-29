package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient/*订单管理*/
@MapperScan("com.mr.mapper")
public class OrderJyyWwApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderJyyWwApplication.class, args);
    }

}
