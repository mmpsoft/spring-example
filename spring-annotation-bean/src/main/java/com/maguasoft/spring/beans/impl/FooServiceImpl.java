package com.maguasoft.spring.beans.impl;

import com.maguasoft.spring.beans.FooService;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {
    @Override
    public void save() {
        System.out.println("FooServiceImpl#save");
    }
}
