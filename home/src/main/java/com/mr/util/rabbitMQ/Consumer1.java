package com.mr.util.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer1 {

    @RabbitHandler
    @RabbitListener(queues = "mr.java1902")
    public void testUse(String msg) throws IOException {
        System.out.println(msg+"    test1");
    }

}
