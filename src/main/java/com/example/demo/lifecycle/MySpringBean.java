package com.example.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class MySpringBean implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {
    private String message;
    public void sendMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
    @Override
    public void setBeanName(String name) {
        log.info("--- setBeanName executed ---");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("--- setApplicationContext executed ---");
    }
    @PostConstruct
    public void postConstruct() {
        log.info("--- @PostConstruct executed ---");
    }
    @Override
    public void afterPropertiesSet() {
        log.info("--- afterPropertiesSet executed ---");
    }
    public void initMethod() {
        log.info("--- custom init-method executed ---");
        this.message = "hello world";
    }
    @PreDestroy
    public void preDestroy() {
        log.info("--- @PreDestroy executed ---");
    }
    @Override
    public void destroy() throws Exception {
        log.info("--- destroy executed ---");
    }
    public void destroyMethod() {
        log.info("--- custom destroy-method executed ---");
    }

  
}