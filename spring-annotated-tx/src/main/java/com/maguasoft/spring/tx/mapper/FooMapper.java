package com.maguasoft.spring.tx.mapper;

import org.apache.ibatis.annotations.Update;

public interface FooMapper {

    @Update("update `account` set money = money - 500 where id = 1")
    int save();

    @Update("update `account` set money = money + 500 where id = 2")
    int update();
}
