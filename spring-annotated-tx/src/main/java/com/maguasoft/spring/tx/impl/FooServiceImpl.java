package com.maguasoft.spring.tx.impl;

import com.maguasoft.spring.tx.AccountService;
import com.maguasoft.spring.tx.FooService;
import com.maguasoft.spring.tx.mapper.FooMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FooServiceImpl implements FooService {

    public static final Logger log = LoggerFactory.getLogger(FooServiceImpl.class);

    @Autowired
    private FooMapper fooMapper;

    @Autowired
    private AccountService accountService;

    @Override
    @Transactional
    public void save() {
        log.info("FooServiceImpl#save");
        fooMapper.save();
        accountService.update();
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public void update() {
        log.info("FooServiceImpl#update");
        log.info("{}", 1/0);
        fooMapper.update();
    }
}
