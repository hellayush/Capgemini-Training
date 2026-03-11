package com.gal.all;

import com.gal.algo.Calc;
import com.gal.algo.MyCalc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyBeansConfig {

    @Bean
    StringBuilder getStringBuilder() {
        return new StringBuilder("bean from configuration");
    }

    @Bean
    @Primary
    Calc getCalc() {
        return new MyCalc();
    }

    @Bean(name = "calcNamedBean")
    Calc getCalc2() {
        return new MyCalc();
    }

    @Bean
    DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/testdb");
        ds.setUsername("root");
        ds.setPassword("password");

        return ds;

    }
}