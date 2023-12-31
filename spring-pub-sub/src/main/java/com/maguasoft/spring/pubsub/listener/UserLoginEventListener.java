package com.maguasoft.spring.pubsub.listener;

import com.maguasoft.spring.pubsub.UserLoginEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class UserLoginEventListener {

    @Order(999)
    @EventListener
    public void eventListener(UserLoginEvent event) {
        System.out.printf("同步消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
    }
}
