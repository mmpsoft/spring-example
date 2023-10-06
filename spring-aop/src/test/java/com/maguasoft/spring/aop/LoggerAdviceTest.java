package com.maguasoft.spring.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoggerAdviceTest {

    @Test
    public void testLoggerAdvice() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login();
    }
}
