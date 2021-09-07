package com.example.demo.crossref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanB {
    @Autowired
    public BeanA bean1;
    public String name = "bean-b";
    @PostConstruct
    public void init() {
        System.out.println("inject bean-A");
        bean1.setBean2(this);
    }
}
