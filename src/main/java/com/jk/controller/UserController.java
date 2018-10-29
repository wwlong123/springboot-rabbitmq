package com.jk.controller;

import com.jk.service.UserService;
import com.jk.utils.TestThread;
import org.apache.catalina.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Executable;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class UserController {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    @RequestMapping("send")
    private String send(){
        amqpTemplate.convertAndSend("A1804","你好世界");
        return "ssssss";
    }
    @RequestMapping("getSend")
    private String getSend(){
        UUID uuid = UUID.randomUUID();
        singleThreadExecutor.execute(new TestThread(userService,uuid.toString()));
        return "andem";
    }
}
