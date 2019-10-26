package com.mr.util.rabbitMQ;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TopicConfig {

    @Bean
    public Queue coreQueue(){
        return new Queue("mr.java1902");
    }

    @Bean
    public TopicExchange coreExchange(){
        return new TopicExchange("java1902Exchange");
    }

    @Bean
    public Binding bindCoreQueueExchange(Queue coreQueue, TopicExchange coreExchange){
        return BindingBuilder.bind(coreQueue).to(coreExchange).with("mr.java1902.*");
    }

}
