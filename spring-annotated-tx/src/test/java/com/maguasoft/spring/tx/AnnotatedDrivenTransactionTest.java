package com.maguasoft.spring.tx;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotatedDrivenTransactionTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        this.applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        jdbcTemplate.execute("drop table if exists `account`;");
        jdbcTemplate.execute("create table `account` (id int, money int);");
        jdbcTemplate.execute("insert into `account` values (1, 10000);");
        jdbcTemplate.execute("insert into `account` values (2, 10000);");
    }

    @Test
    public void testTx() {
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.save();
    }
}
