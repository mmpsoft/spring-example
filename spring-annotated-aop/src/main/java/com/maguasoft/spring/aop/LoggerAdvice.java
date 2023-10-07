package com.maguasoft.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAdvice {

    @Before("execution(* com.maguasoft.spring..* (..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("LoggerAdvice.before");
        System.out.printf("LoggerAdvice.before, %s-%s \n", joinPoint.getTarget(), joinPoint.getSignature());
    }

    @AfterReturning("execution(* com.maguasoft.spring..* (..))")
    public void afterReturning() {
        System.out.println("LoggerAdvice.afterReturning");
    }

    @AfterThrowing("execution(* com.maguasoft.spring..* (..))")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.printf("LoggerAdvice.afterThrowing, %s-%s \n", joinPoint.getTarget(), joinPoint.getSignature());
    }

    @Around("execution(* com.maguasoft.spring..* (..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggerAdvice.around-before");
        Object result = joinPoint.proceed(joinPoint.getArgs());
        System.out.println("LoggerAdvice.around-after");
    }

    @After("execution(* com.maguasoft.spring..* (..))")
    public void after() {
        System.out.println("LoggerAdvice.after");
    }
}
