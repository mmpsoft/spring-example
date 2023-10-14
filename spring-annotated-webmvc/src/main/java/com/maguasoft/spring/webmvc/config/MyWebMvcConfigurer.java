package com.maguasoft.spring.webmvc.config;

import com.maguasoft.spring.webmvc.interceptor.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    /**
     * 配置静态资源的访问，
     * 等同于 <mvc:default-servlet-handler/> 或 <mvc:resources mapping="images" location="/pics" />
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // 开启配置
        configurer.enable();
    }

    /**
     * 配置拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**");
    }

    /**
     * 配置跨域
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 可以被跨域请求的接口，/**此时表示所有
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowCredentials(false)
                .exposedHeaders("")
                .maxAge(3600);
    }
}
