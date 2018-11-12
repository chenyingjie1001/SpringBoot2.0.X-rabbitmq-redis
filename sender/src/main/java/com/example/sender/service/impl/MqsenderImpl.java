package com.example.sender.service.impl;

import com.example.sender.service.MqSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MqsenderImpl implements MqSender {

    @Autowired
    private AmqpTemplate template;
    @Override
    public void sender(Object msg) {
        log.info("send a msg");

        template.convertAndSend("test1", msg);
    }
}
