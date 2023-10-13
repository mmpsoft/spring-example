package com.maguasoft.spring.webmvc.controller;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/quick")
public class QuickController {

    @RequestMapping("/foo1")
    public String foo1() {
        log.info("QuickController#foo1");
        return "/index.jsp";
    }

    @RequestMapping(value = "/foo2", method = RequestMethod.GET, headers = "application/json")
    public String foo2() {
        log.info("QuickController#foo2");
        return "/index.jsp";
    }

    // http://localhost/quick/foo3?name=zhangsan&age=11
    @RequestMapping(value = "/foo3", consumes = MediaType.TEXT_XML_VALUE, produces = MediaType.TEXT_XML_VALUE, params = "")
    public String foo3(String name, Integer age) {
        log.info("QuickController#foo3");
        return "/index.jsp";
    }

    // http://localhost/quick/foo4?name=zhangsan&age=11
    @RequestMapping(value = "/foo4")
    public String foo4(String name, Integer age) {
        log.info("QuickController#foo4");
        return "/index.jsp";
    }

    // http://localhost/quick/foo5?hobbys=zq&hobby=lq&hobby=pq
    @RequestMapping(value = "/foo5")
    public String foo5(String[] hobby) {
        log.info("QuickController#foo5");
        return "/index.jsp";
    }

    // http://localhost/quick/foo6?hobbys=zq&hobby=lq&hobby=pq
    @RequestMapping(value = "/foo6")
    public String foo6(List<String> hobby) {
        log.info("QuickController#foo6");
        return "/index.jsp";
    }

    // http://localhost/quick/foo7?nickname=zhangsan&age=11
    @RequestMapping(value = "/foo7")
    public String foo7(Map<String, Object> map) {
        log.info("QuickController#foo7");
        return "/index.jsp";
    }

    // http://localhost/quick/foo8?nickname=zhangsan&age=11
    @RequestMapping(value = "/foo8")
    public String foo8(@RequestParam(value = "nickname", defaultValue = "") String name, Integer age) {
        log.info("QuickController#foo8");
        return "/index.jsp";
    }

    // http://localhost/quick/foo9?nickname=zhangsan&age=11
    @RequestMapping(value = "/foo9")
    public String foo9(@RequestParam(value = "nickname", required = true, defaultValue = "") String name, Integer age) {
        log.info("QuickController#foo9");
        return "/index.jsp";
    }

    // http://localhost/quick/foo10?name=zhangsan&age=11
    @RequestMapping(value = "/foo10")
    public String foo10(User user) {
        log.info("QuickController#foo9");
        return "/index.jsp";
    }

    @Getter
    @Setter
    public static final class User {
        String name;
        Integer age;
    }


    // http://localhost/quick/foo11
    // 请求体：{"name":"", "age": 18}
    @PostMapping(value = "/foo11")
    public String foo11(@RequestBody User user) {
        log.info("QuickController#foo11");
        return "/index.jsp";
    }

    // http://localhost/quick/foo12
    // 请求体：{"name":"", "age": 18}
    @PostMapping(value = "/foo12")
    @ResponseBody
    public Map<String, Object> foo12(@RequestBody User user) {
        // @RequestBody会解析请求体中JSON格式的参数
        // @ResponseBody把想要的数据转换成JSON格式数据，并把它放在响应体中返回。
        log.info("QuickController#foo12");
        return new HashMap<>();
    }

    /**
     * 上传文件
     * 需要以下数据格式提交
     * <form enctype="multipart/form-data" method="post">
     * <input type="file" name="fileTarget"/>
     * </form>
     * 1、请求方式必须是 POST
     * 2、form的enctype必须是 multipart/form-data
     * 3、<input name="fileTarget">需要指定name属性
     * <p>
     * 需要引入common-fileupload.jar包，并且需要注入CommonsMultipartResolver
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/foo13")
    @ResponseBody
    public Map<String, Object> foo13(@RequestParam("fileTarget") MultipartFile file) throws IOException {
        // 文件流
        InputStream inputStream = file.getInputStream();
        log.info("QuickController#foo13");
        return new HashMap<>();
    }

    /**
     * 获取请求头的数据
     *
     * @param contextType
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/foo14")
    @ResponseBody
    public String foo14(@RequestHeader("context-type") String contextType) throws IOException {
        log.info("QuickController#foo14");
        return "/index.jsp";
    }

    /**
     * 获取所有请求头的数据
     *
     * @param headers
     */
    @PostMapping(value = "/foo15")
    @ResponseBody
    public String foo15(@RequestHeader Map<String, String> headers) throws IOException {
        log.info("QuickController#foo15");
        return "/index.jsp";
    }

    /**
     * 获取Cookie的数据
     *
     * @param jsessionid
     */
    @PostMapping(value = "/foo16")
    @ResponseBody
    public String foo16(@CookieValue("JSESSIONID") String jsessionid) throws IOException {
        log.info("QuickController#foo16");
        return "/index.jsp";
    }

    /**
     * 获取所有Cookie的数据
     *
     * @param cookies
     */
    @PostMapping(value = "/foo17")
    @ResponseBody
    public String foo17(@CookieValue("JSESSIONID") Map<String, String> cookies) throws IOException {
        log.info("QuickController#foo17");
        return "/index.jsp";
    }

    /**
     *
     *获取HttpServletRequest、HttpServletResponse数据，SpringMVC处理是，会自动传入这个两个参数。
     *
     */
    @PostMapping(value = "/foo18")
    @ResponseBody
    public String foo18(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("QuickController#foo18");
        return "/index.jsp";
    }

    /**
     * 获取Request域中的数据
     *
     * @param username
     */
    @PostMapping(value = "/foo19")
    @ResponseBody
    public String foo19(@RequestAttribute("username") String username) throws IOException {
        log.info("QuickController#foo19");
        return "/index.jsp";
    }
}
