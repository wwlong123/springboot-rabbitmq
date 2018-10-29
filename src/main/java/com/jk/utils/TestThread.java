package com.jk.utils;

import com.jk.service.UserService;
import org.springframework.amqp.core.AmqpTemplate;

public class TestThread implements Runnable {
    private UserService userService;

    private AmqpTemplate amqpTemplate;

    private String  Uuid;
    @Override
    public void run() {

        userService.getHolleWord(Uuid);

    }
    public TestThread(UserService userService, String uuid) {
        this.userService = userService;
        Uuid = uuid;
    }
    public TestThread(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public TestThread() {
    }
}
