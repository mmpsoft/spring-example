package com.maguasoft.spring.webmvc.starter;

import com.maguasoft.spring.webmvc.config.SpringConfig;
import com.maguasoft.spring.webmvc.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AnnotatedWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 配置Spring核心容器的配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * 配置Spring MVC容器的配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    /**
     * 前端控制器的映射的路径
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
