package com.example.demo.lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.condition.DataConfig;
import com.example.demo.condition.DataDAO;

@SpringBootTest
@ContextConfiguration(classes = {DataConfig.class})
public class DataTypeConfigTest2 {
//    @Autowired
//    DataDAO data;
    static {
        //System.setProperty("dbType", "MONGO");
        System.setProperty("dbType", "MYSQL");
    }

    @Autowired
    ApplicationContext context;

   
    @Test
    void testData2(){
        // System.setProperty("dbType", "MYSQL");
        DataDAO data = context.getBean(DataDAO.class);
        String user = data.getUser();
        System.out.println("data => " + user);
        assertEquals("user from mysql", user);
    }
}
