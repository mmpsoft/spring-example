package com.maguasoft.spring.aop;

import com.maguasoft.spring.aop.cglib.CglibProxy;
import com.maguasoft.spring.aop.cglib.CglibTarget;
import org.junit.Test;


public class CglibProxyTest {
    @Test
    public void testCglibProxy() {
        CglibProxy cglibProxy = new CglibProxy();
        CglibTarget proxy = cglibProxy.newProxy();

        proxy.applyTarget();
    }
}
