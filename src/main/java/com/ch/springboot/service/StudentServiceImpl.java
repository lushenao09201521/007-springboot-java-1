package com.ch.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public String sayHello() {
        return "Say Hello";
    }

    @Override
    public String sayHello2(String msg) {
        return "Say" + msg;
    }


}
