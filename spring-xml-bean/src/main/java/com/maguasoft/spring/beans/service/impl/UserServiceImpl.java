package com.maguasoft.spring.beans.service.impl;

import com.maguasoft.spring.beans.dao.UserMapper;
import com.maguasoft.spring.beans.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void login(String name, String password) {
        Boolean isExisted = userMapper.queryUser(name, password);
        if (isExisted) {
            System.out.printf("User %s login successful \n", name);
        }
    }

    public void initMethod() {
        System.out.println("initMethod");
    }

    public void destroyMethod() {
        System.out.println("destroyMethod");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
