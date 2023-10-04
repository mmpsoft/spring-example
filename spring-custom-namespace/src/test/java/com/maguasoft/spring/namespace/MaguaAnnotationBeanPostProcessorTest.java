package com.maguasoft.spring.namespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaguaAnnotationBeanPostProcessorTest {

    @Test
    public void testMaguaAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService bean = applicationContext.getBean(UserService.class);
        System.out.println(bean);
    }
}
