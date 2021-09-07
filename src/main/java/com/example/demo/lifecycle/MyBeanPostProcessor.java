package com.example.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            System.out.println("--- postProcessBeforeInitialization executed MySpringBean ---");
        }else
        if (bean instanceof MySecondBean) {
            System.out.println("--- postProcessBeforeInitialization executed MySecondBean ---");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            System.out.println("--- postProcessAfterInitialization executed MySpringBean ---");
        }
        if (bean instanceof MySecondBean) {
            System.out.println("--- postProcessAfterInitialization executed MySecondBean ---");
        }
        return bean;
    }

}