package com.maguasoft.spring.tx;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.HashMap;

public class XMLConfigTransactionTest {
    private JdbcTemplate jdbcTemplate;
    private ClassPathXmlApplicationContext applicationContext;

    @Before
    public void before() {
        this.applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        this.jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("drop table if exists `account`");
        jdbcTemplate.execute("create table `account` (id int, money int)");

        for (int index = 1; index <= 2; index++) {
            jdbcTemplate.execute(String.format("insert into `account` values (%s, %s)", index, 10000));
        }
    }

    @Test
    public void testTx() {
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.save();
    }
}
