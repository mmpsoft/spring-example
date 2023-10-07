package com.maguasoft.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void apply() {
        System.out.println("UserService.apply");
    }
}
