package com.example.demo.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.condition")
public class DataConfig
{
    @Bean
    @DatabaseType("MYSQL")
    public DataDAO jdbcUserDAO(){
        return new MySqlData();
    }

    @Bean
    @DatabaseType("MONGO")
    public DataDAO mongoUserDAO(){
        return new MongoData();
    }
}