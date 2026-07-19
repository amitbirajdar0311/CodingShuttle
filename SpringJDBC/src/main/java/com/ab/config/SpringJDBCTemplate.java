package com.ab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBCTemplate {

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(driverManagerDataSource());
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
        return new NamedParameterJdbcTemplate(driverManagerDataSource());
    }

}
