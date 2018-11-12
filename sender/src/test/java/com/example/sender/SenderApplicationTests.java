package com.example.sender;

import com.example.sender.service.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SenderApplicationTests {


    @Autowired
    private MqSender mqSender;
    @Test
    public void contextLoads() {



        mqSender.sender("1231232123");
    }

}
