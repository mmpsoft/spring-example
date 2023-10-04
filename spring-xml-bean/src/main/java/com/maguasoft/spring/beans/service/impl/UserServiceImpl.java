package com.maguasoft.spring.beans.service.impl;

import com.maguasoft.spring.beans.dao.UserMapper;
import com.maguasoft.spring.beans.service.UserService;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void login(String name, String password) {
        Boolean isExisted = userMapper.queryUser(name, password);
        if (isExisted) {
            System.out.printf("User %s login successful", name);
        }
    }
}
