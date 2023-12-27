package com.maguasoft.spring.aop;

import com.maguasoft.spring.aop.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotatedAopTest {

    @Test
    public void testAnnotatedAop1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.apply();
    }

    @Test
    public void testAnnotatedAop2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.apply();
    }

    @Test
    public void testAnnotatedAop3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.testAnnotation();
    }
}
