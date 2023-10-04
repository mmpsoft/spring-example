package com.maguasoft.spring.bean;

import com.maguasoft.spring.beans.dao.UserMapper;
import com.maguasoft.spring.beans.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLBeanTest {

    @Test
    public void testXmlBean() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("spring.xml");

        UserMapper userMapper = beanFactory.getBean(UserMapper.class);
        UserServiceImpl userService = beanFactory.getBean(UserServiceImpl.class);
        System.out.println(userMapper);
        System.out.println(userService);

        userService.login("zhangsan", "123");
    }

    @Test
    public void testApplicationContext() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        UserServiceImpl userService = applicationContext.getBean(UserServiceImpl.class);
        System.out.println(userMapper);
        System.out.println(userService);

        userService.login("zhangsan", "123");

        applicationContext.close();
    }
}
