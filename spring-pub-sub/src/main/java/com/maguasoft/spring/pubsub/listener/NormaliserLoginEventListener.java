package com.maguasoft.spring.pubsub.listener;

import com.maguasoft.spring.pubsub.UserLoginEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NormaliserLoginEventListener implements ApplicationListener<UserLoginEvent> {
    public void onApplicationEvent(UserLoginEvent event) {
        System.out.printf("实现接口ApplicationListener消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
    }
}
