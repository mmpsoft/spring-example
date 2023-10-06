package com.maguasoft.spring.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LoggerAdvisorAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    /**
     * 后置通知
     *
     * @param returnValue the value returned by the method, if any
     * @param method      the method being invoked
     * @param args        the arguments to the method
     * @param target      the target of the method invocation. May be {@code null}.
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Advisor-afterReturning");
    }

    /**
     * 前置通知
     *
     * @param method the method being invoked
     * @param args   the arguments to the method
     * @param target the target of the method invocation. May be {@code null}.
     * @throws Throwable
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Advisor-before");
    }
}
