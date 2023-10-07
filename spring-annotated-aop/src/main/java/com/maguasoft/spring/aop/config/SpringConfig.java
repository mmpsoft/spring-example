package com.maguasoft.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // 开启注解配置aop
@ComponentScan("com.maguasoft.spring.aop") // 包扫描
public class SpringConfig {
}
