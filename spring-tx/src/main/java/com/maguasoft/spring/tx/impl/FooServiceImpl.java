package com.maguasoft.spring.tx.impl;

import com.maguasoft.spring.tx.AccountService;
import com.maguasoft.spring.tx.FooService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
@Slf4j
public class FooServiceImpl implements FooService {

    private JdbcTemplate jdbcTemplate;
    private AccountService accountService;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void save() {
        log.info("FooServiceImpl#save");
        jdbcTemplate.execute("update `account` set money = money - 500 where id = 1");
        accountService.update();
    }

    @Override
    public void update() {
        log.info("FooServiceImpl#update");
        jdbcTemplate.execute("update `account` set money = money + 500 where id = 2");
    }
}
