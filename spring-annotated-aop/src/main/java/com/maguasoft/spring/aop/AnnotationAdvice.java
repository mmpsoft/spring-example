package com.maguasoft.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAdvice {

//    @Pointcut("@annotation(com.maguasoft.spring.aop.TestAnnotation)")
//    public void advice() {
//        System.out.println("advice");
//    }

    @Around("@annotation(com.maguasoft.spring.aop.TestAnnotation)")
    public Object process(ProceedingJoinPoint joinPoint) {
        System.out.println("process...");
        try {
            return joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
