package com.maguasoft.spring.pubsub.listener;

import com.maguasoft.spring.pubsub.UserLoginEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class NormaliserLoginEventListener implements ApplicationListener<UserLoginEvent>, PriorityOrdered {
    public void onApplicationEvent(UserLoginEvent event) {
        System.out.printf("实现接口ApplicationListener消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
    }

    /**
     * 如果存在多个监听器监听同一个事件时，order值越小的监听器优先执行。
     *
     * @return
     */
    public int getOrder() {
        return 9999;
    }

    // @LocalCacheable()
    // @RemoteCacheable(name='', key=' ')
}
