package com.maguasoft.spring.pubsub.listener;

import com.maguasoft.spring.pubsub.UserLoginEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserLoginTransactionalEventListener {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void eventListener(UserLoginEvent event) {
        System.out.printf("具有事务能力的消费事件处理：%s -> %s\n", Thread.currentThread().getName(), event);
    }
}
