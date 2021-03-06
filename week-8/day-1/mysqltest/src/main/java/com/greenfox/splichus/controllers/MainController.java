package com.greenfox.splichus.controllers;


import com.greenfox.splichus.models.Todo;
import com.greenfox.splichus.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    TodoRepo database;

    @Autowired
    public MainController(TodoRepo database) {
        this.database = database;
    }

    @GetMapping({"/", "/list", "/todo"})
    public String todo(@RequestParam(required = false) boolean isActive, Model model) {
        if (isActive) {
            model.addAttribute("list", database.findAll().stream().filter(t -> !t.isDone()).collect(Collectors.toList()));
        } else {
            model.addAttribute("list", database.findAll());
        }
        return "list";
    }

    @GetMapping("/todo/add")
    public String add() {
        return "add";
    }

    @PostMapping("/todo/add")
    public String add(String name) {
        database.save(new Todo(name));
        return "redirect:/todo";
    }
}
