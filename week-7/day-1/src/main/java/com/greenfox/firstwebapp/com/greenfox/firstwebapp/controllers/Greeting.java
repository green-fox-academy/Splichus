package com.greenfox.firstwebapp.com.greenfox.firstwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Greeting {

    private long id= 0;
    private String contents;

    public Greeting(long id, String contents) {
        this.id = id;
        this.contents = contents;
    }

    public long getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }
}
