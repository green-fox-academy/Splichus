package com.greenfox.splichus.week9day1.controllers;

import com.greenfox.splichus.week9day1.models.*;
import com.greenfox.splichus.week9day1.models.Input.RecievedArray;
import com.greenfox.splichus.week9day1.models.Input.RecievedNumber;
import com.greenfox.splichus.week9day1.repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainRestController {

    LogRepo logdatabase;

    @Autowired
    public MainRestController(LogRepo logdatabase) {
        this.logdatabase = logdatabase;
    }

    @RequestMapping("/doubling")
    public Doubling doubling(@RequestParam(required = false) Integer input) {
        Log log = new Log(LocalDateTime.now(),"/doubling", "\"input\": \""+input+"\"");
        logdatabase.save(log);
        return new Doubling(input);
    }
    @GetMapping("/greeter")
    public Greeter greeter(@RequestParam(required = false) String name,
                           @RequestParam(required = false) String title){
        Log log = new Log(LocalDateTime.now(),"/greeter", "\"name\": \""+name+"\", \"title\": \""+title+"\"");
        logdatabase.save(log);
        return new Greeter(name, title);
    }
    @GetMapping("/appenda/{appendable}")
    public Append append(@PathVariable("appendable") String appendable) {
        Log log = new Log(LocalDateTime.now(),"/appenda", "\"appendable\": \""+appendable+"\"");
        logdatabase.save(log);
        return new Append(appendable);
    }
    @PostMapping("/dountil/{action}")
    public DoUntil doUntil(@PathVariable("action") String what,
                           @RequestBody RecievedNumber until) {
        Log log = new Log(LocalDateTime.now(),"/dountil", until.toString());
        logdatabase.save(log);
        return new DoUntil(what,until.getUntil());
    }
    @PostMapping("/arrays")
    public ArraysResult arrays(@RequestBody RecievedArray array){
        Log log = new Log(LocalDateTime.now(),"/arrays", array.toString());
        logdatabase.save(log);
        return new ArraysResult(array.getWhat(), array.getNumbers());
    }

    @GetMapping("/log")
    public List<Log> logs() {
        return logdatabase.findAll();
    }

}
