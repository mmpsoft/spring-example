package com.maguasoft.spring.bean;

import com.maguasoft.spring.beans.dao.UserMapper;
import com.maguasoft.spring.beans.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

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
}
