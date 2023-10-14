package com.maguasoft.spring.webmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/foo")
public class FooController {

    @GetMapping("/get")
    public String get() {
        log.info("FooController#foo");
        return "/index.jsp";
    }
}
