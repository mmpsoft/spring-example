package com.maguasoft.spring.tx.impl;

import com.maguasoft.spring.tx.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountServiceImpl implements AccountService {

    public static final Logger log = LoggerFactory.getLogger(FooServiceImpl.class);

    private final JdbcTemplate jdbcTemplate;

    public AccountServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void update() {
        log.info("AccountServiceImpl#update");
        log.info("{}", 1/0);
        jdbcTemplate.execute("update `account` set money = money + 500 where id = 2");
    }
}
