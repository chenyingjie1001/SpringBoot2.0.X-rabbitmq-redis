package com.example.sender.mq;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConfig {

    @Bean
    public Queue queue(){
        return new Queue("test");
    }

    @Bean
    public Queue queue1(){
        return new Queue("test1");
    }
}
