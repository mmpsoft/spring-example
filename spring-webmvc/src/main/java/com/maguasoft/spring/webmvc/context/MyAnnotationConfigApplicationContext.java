package com.maguasoft.spring.webmvc.context;

import com.maguasoft.spring.webmvc.config.SpringConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyAnnotationConfigApplicationContext extends AnnotationConfigWebApplicationContext {

    public MyAnnotationConfigApplicationContext() {
        this.register(SpringConfig.class);
    }
}
