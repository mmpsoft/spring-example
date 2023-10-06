package com.maguasoft.spring.pubsub;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

public class UserServiceImplTest {

    @Test
    public void testPublishEvent() throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userService = applicationContext.getBean(UserServiceImpl.class);
        userService.login();

        Thread.sleep(3000);
    }
}
