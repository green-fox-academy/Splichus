package com.greenfox.firstwebapp.com.greenfox.firstwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    static AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(name = "name") String name) {
        counter.getAndIncrement();
        return new Greeting(counter.get(), "Hello, "+name+"!");
    }
}
