package com.maguasoft.spring.webmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.maguasoft.spring.webmvc.controller")
public class SpringMVCConfig {

    /**
     * 注入上传文件Bean
     *
     * @return
     */
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setDefaultEncoding("UTF-8");
        multipartResolver.setMaxUploadSizePerFile(1048576);
        multipartResolver.setMaxUploadSize(10485760);
        multipartResolver.setMaxInMemorySize(1048576);
        return multipartResolver;
    }
}
