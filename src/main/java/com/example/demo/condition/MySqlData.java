package com.example.demo.condition;

public class MySqlData implements DataDAO{
    @Override
    public String getUser() {
        return "user from mysql";
    }
}
