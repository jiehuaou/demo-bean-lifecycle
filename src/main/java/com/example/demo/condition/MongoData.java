package com.example.demo.condition;

public class MongoData implements DataDAO{
    @Override
    public String getUser() {
        return "user from mongo";
    }
}
