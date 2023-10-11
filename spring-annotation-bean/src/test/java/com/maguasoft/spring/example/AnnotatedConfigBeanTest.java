package com.maguasoft.spring.example;

import com.maguasoft.spring.beans.FooService;
import com.maguasoft.spring.beans.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatedConfigBeanTest {

    @Test
    public void testAnnotatedDrivenBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.save();
    }

    @Test
    public void testAnnotatedConfigBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.save();
    }
}
