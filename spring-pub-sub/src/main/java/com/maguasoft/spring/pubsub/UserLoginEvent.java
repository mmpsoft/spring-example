package com.maguasoft.spring.pubsub;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@ToString
public class UserLoginEvent extends ApplicationEvent {

    private String name;

    public UserLoginEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
