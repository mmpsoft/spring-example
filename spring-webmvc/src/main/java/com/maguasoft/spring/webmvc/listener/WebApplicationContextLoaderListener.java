package com.maguasoft.spring.webmvc.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebApplicationContextLoaderListener implements ServletContextListener {

    private ClassPathXmlApplicationContext applicationContext;

    public static final String CONTEXT_CONFIG_LOCATION_PARAM_NAME = "contextConfigLocation";

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        applicationContext.close();
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        // 获取web.xml文件里的<context-param>参数，获取Spring XML配置文件
        String contextConfigLocation = servletContext.getInitParameter(CONTEXT_CONFIG_LOCATION_PARAM_NAME);
        this.applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("applicationContext", applicationContext);
    }
}
