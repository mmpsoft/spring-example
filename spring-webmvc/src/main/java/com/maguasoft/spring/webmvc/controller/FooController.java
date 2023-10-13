package com.maguasoft.spring.webmvc.controller;

import com.maguasoft.spring.webmvc.service.FooService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet("/foo")
public class FooController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("FooController#doGet");
        ServletContext servletContext = request.getServletContext();
        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.get();
    }
}
