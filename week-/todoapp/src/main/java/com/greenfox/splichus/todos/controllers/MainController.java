package com.greenfox.splichus.todos.controllers;


import com.greenfox.splichus.todos.models.Todo;
import com.greenfox.splichus.todos.repositories.TodoRepo;
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
        return "home";
    }

    @GetMapping("/todo/add")
    public String add() {
        return "add";
    }

    @PostMapping("/todo/add")
    public String add(String name, boolean urgent, boolean done) {
        database.save(new Todo(name, urgent, done));
        return "redirect:/todo";
    }
    @GetMapping("/todo/edit")
    public String edit(Long id, Model model) {
        model.addAttribute("todo", database.findById(id).get());
        return "edit";
    }
    @PostMapping("/todo/delete")
    public String delete (Long id){
        database.deleteById(id);
        return "redirect:/todo";
    }
    @PostMapping("/todo/edit")
    public String todo(Long id, String name, boolean done, boolean urgent) {
        Todo helper = database.findById(id).get();
        helper.setTitle(name);
        helper.setDone(done);
        helper.setUrgent(urgent);
        database.save(helper);
        return "redirect:/todo";
    }
}
