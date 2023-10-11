package com.maguasoft.spring.tx.impl;

import com.maguasoft.spring.tx.AccountService;
import com.maguasoft.spring.tx.mapper.AccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    public static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void update() {
        log.info("AccountServiceImpl#update");
        try {
            log.info("{}", 1/0);
        } catch (Exception e) {
            log.error("", e);
        }
    }
}
