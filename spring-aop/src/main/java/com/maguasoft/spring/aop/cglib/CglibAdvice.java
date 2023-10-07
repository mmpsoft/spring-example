package com.maguasoft.spring.aop.cglib;

public class CglibAdvice {

    void before() {
        System.out.println("Cglib before advice");
    }

    void after() {
        System.out.println("Cglib after advice");
    }
}
