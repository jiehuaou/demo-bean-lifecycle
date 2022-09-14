package com.example.demo.lifecycle;

import com.example.demo.crossref.BeanA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {CrossReferenceTestConfig.class})
public class CrossReferenceTest {

    @Autowired
    ApplicationContext context;

    @Test
    void testCrossRef1(){
        System.out.println("test start");
        BeanA b1 = context.getBean(BeanA.class);
        System.out.println(b1.bean2.name);
        assertEquals("bean-b", b1.bean2.name);
    }
}
