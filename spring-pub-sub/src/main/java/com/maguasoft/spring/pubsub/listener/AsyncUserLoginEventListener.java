package com.maguasoft.spring.pubsub.listener;

import com.maguasoft.spring.pubsub.UserLoginEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * 异常消费事件
 */
@Component
@EnableAsync
public class AsyncUserLoginEventListener {

    @Async
    @EventListener
    public void eventListener(UserLoginEvent event) {
        System.out.printf("异步消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
    }
}
