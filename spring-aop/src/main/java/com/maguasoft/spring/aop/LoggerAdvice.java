package com.maguasoft.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAdvice {

    public void before() {
        System.out.println("before");
    }
    public void afterReturning() {
        System.out.println("afterReturning");
    }
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around-before");
        joinPoint.proceed(joinPoint.getArgs());
        System.out.println("around-after");
    }
    public void after() {
        System.out.println("after");
    }
}
