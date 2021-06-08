package com.spring;

public class Greeting {
    public long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    final long id;
    final String msg;
    Greeting(long id, String m){
        this.id = id;
        this.msg = m;
    }
}
