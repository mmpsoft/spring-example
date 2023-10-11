package com.maguasoft.spring.beans.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.maguasoft.*")
public class SpringConfig {

    /**
     * 注入一个bean
     *
     * @return
     */
//    @Bean
//    public DataSource dataSource() {
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setDriverClassName("DriverClassName");
//        dataSource.setJdbcUrl("JdbcUrl");
//        dataSource.setUsername("Username");
//        dataSource.setPassword("Password");
//        return dataSource;
//    }
}
