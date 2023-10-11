package com.maguasoft.spring.tx.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
@EnableTransactionManagement
@ComponentScan("com.maguasoft.spring.**")
public class SpringConfig {

    @Setter
    @Getter
    @Configuration
    @PropertySource("classpath:jdbc.properties")
    public static class MybatisProps {
        @Value("${spring.database.driver-class-name}")
        String driverClassName;
        @Value("${spring.database.url}")
        String url;
        @Value("${spring.database.username}")
        String username;
        @Value("${spring.database.password}")
        String password;
    }

    @Bean
    public DataSource dataSource(MybatisProps props) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(props.getDriverClassName());
        dataSource.setJdbcUrl(props.getUrl());
        dataSource.setUsername(props.getUsername());
        dataSource.setPassword(props.getPassword());
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
