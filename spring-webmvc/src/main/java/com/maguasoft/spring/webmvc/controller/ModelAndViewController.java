package com.maguasoft.spring.webmvc.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/modelAndView")
public class ModelAndViewController {

    @GetMapping("/forward")
    public ModelAndView forward(ModelAndView modelAndView) {
        modelAndView.addObject("user", new User("zhangsan", 18));
        modelAndView.setViewName("./user.jsp");

        return modelAndView;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class User {
        private String name;
        private Integer age;
    }
}
