package com.maguasoft.spring.imports;

import com.maguasoft.spring.imports.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.apply();

        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.apply();

        LoginService loginService = applicationContext.getBean(LoginService.class);
        loginService.apply();

        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.apply();
    }
}
