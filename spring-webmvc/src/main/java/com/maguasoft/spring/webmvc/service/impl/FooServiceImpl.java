package com.maguasoft.spring.webmvc.service.impl;

import com.maguasoft.spring.webmvc.service.FooService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FooServiceImpl implements FooService {

    @Override
    public String get() {
        log.info("FooServiceImpl#get");
        return "FooServiceImpl#get";
    }
}
