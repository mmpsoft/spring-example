package com.maguasoft.spring.tx;

import com.maguasoft.spring.tx.config.SpringConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotatedConfigTransactionTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        this.applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
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
