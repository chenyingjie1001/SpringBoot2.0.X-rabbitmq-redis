package com.example.reveiver.mq;

import com.rabbitmq.tools.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Slf4j
@RabbitListener(queues = "test")
public class Reveiver {

    @RabbitHandler
    public void handler(Object msg){
        // do u job
        log.error("do u job");
        log.error(msg.toString());
    }

}
