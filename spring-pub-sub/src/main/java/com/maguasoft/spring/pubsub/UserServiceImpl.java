package com.maguasoft.spring.pubsub;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements ApplicationContextAware {

    /**
     * ApplicationContext继承了ApplicationEventPublisher接口，有发布事件能力。
     */
    private ApplicationContext applicationContext;

    public void login() {
        // do working...

        // publish event
        applicationContext.publishEvent(new UserLoginEvent(this, "zhangsan"));
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
