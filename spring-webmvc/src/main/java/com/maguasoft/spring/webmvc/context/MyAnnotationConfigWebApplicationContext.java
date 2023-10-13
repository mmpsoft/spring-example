package com.maguasoft.spring.webmvc.context;

import com.maguasoft.spring.webmvc.config.SpringMVCConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {

    public MyAnnotationConfigWebApplicationContext() {
        this.register(SpringMVCConfig.class);
    }
}
