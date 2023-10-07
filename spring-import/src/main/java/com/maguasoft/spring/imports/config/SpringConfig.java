package com.maguasoft.spring.imports.config;

import com.maguasoft.spring.imports.LoginService;
import com.maguasoft.spring.imports.selector.ClassImportBeanDefinitionRegistrar;
import com.maguasoft.spring.imports.selector.ClassImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.maguasoft.spring.*")
@Import({LoginService.class,  // 注入普通类
        ClassImportSelector.class, // 注入实现ImportSelector接口的
        ClassImportBeanDefinitionRegistrar.class // 注入实现ImportBeanDefinitionRegistrar接口的
})
@ImportResource("spring.xml") // 通过导入文件实现注入UserDao
public class SpringConfig {
}
