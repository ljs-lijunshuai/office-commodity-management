package com.mr.util.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducerSenderMQ {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /*/**
    * @Description: sender 发送消息
    * @Param: [msg]
    * @return: void
    * @Author: yxy
    * @Date: 2019/10/12
    */
    public void sender(String msg){
        amqpTemplate.convertAndSend("java1902Exchange","mr.java1902.test",msg);
    }

}
