package com.maguasoft.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // 开启注解配置aop
@ComponentScan("com.maguasoft.spring.aop") // 包扫描
public class SpringConfig {
}
