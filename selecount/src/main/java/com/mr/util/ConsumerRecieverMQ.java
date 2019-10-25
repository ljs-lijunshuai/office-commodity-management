package com.mr.util;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ConsumerRecieverMQ {

    @RabbitHandler
    @RabbitListener(queues = "mr.java1902")
    public void testUse(String msg) throws IOException {
        System.out.println(msg);
//
////        throw  new IOException("test");
//        try {
//            int i=1/0;
//            System.out.println(msg+" 这就是接收到的数据");
//        }catch (Exception ex){
//            System.out.println("制造错误 重复请求尝试");
//            throw new AmqpRejectAndDontRequeueException("test1");
//        }
    }

}
