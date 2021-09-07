package com.example.demo.crossref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanB bean2;
    public void setBean2(BeanB bean2) {
        System.out.println("inject bean-B");
        this.bean2 = bean2;
    }
}
