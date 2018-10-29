package com.jk.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void getHolleWord(String toString) {
        System.out.println(toString);
    }
}
