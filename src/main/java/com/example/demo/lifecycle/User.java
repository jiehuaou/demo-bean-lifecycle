package com.example.demo.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    MySpringBean myBean;

    public User(MySpringBean myBean) {
        this.myBean = myBean;
    }

    public void clean(){
        this.myBean = null;
    }

    public MySpringBean getMyBean() {
        return myBean;
    }
}
