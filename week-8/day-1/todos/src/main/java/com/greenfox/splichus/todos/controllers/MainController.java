package com.greenfox.splichus.todos.controllers;

import com.greenfox.splichus.todos.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    TodoRepo database;

    @Autowired
    public MainController(TodoRepo database) {
        this.database = database;
    }

    @GetMapping({"/", "list"})
    public String list(Model model) {
        model.addAttribute("list", database.findAll());
        return "list";
    }
}
