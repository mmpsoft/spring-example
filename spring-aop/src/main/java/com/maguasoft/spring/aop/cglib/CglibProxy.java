package com.maguasoft.spring.aop.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {

    @SuppressWarnings("unchecked")
    public <T> T newProxy() {
        final CglibTarget cglibTarget = new CglibTarget();
        final CglibAdvice cglibAdvice = new CglibAdvice();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(cglibTarget.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                cglibAdvice.before();
                Object result = method.invoke(cglibTarget, args);
                cglibAdvice.after();
                return result;
            }
        });

        return (T) enhancer.create();
    }
}
