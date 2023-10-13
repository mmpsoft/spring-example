package com.maguasoft.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forwardAndRedirect")
public class ForwardAndRedirectController {

    @GetMapping("/forward")
    public String forward() {
        // return "forward/index.jsp"; // 可以默认写forward，默认是forward
        return "./index.jsp";
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:./index.jsp";
    }
}
