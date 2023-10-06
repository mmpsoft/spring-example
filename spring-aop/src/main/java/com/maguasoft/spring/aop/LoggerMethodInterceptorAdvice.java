package com.maguasoft.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggerMethodInterceptorAdvice implements MethodInterceptor {

    /**
     * 环绕通知
     *
     * @param invocation the method invocation joinpoint
     * @return
     * @throws Throwable
     */
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Advisor-around-before");

        Object result = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
        System.out.println("Advisor-around-after");

        return result;
    }
}
