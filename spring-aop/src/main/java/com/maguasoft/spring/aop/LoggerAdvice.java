package com.maguasoft.spring.aop;

public class LoggerAdvice {

    public void beforeLogger() {
        System.out.println("before增强");
    }

    public void afterLogger() {
        System.out.println("after增强");
    }
}
