package com.example.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            log.info("--- postProcessBeforeInitialization executed MySpringBean ---");
        }else
        if (bean instanceof MySecondBean) {
            log.info("--- postProcessBeforeInitialization executed MySecondBean ---");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            log.info("--- postProcessAfterInitialization executed MySpringBean ---");
        }
        if (bean instanceof MySecondBean) {
            log.info("--- postProcessAfterInitialization executed MySecondBean ---");
        }
        return bean;
    }

}