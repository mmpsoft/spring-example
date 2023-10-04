package com.maguasoft.spring.beans.dao;

public class UserMapper {
    public Boolean queryUser(String name, String password) {
        return "zhangsan".equals(name) && "123".equals(password);
    }
}
