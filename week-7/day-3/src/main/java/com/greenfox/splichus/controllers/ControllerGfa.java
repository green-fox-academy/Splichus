package com.greenfox.splichus.controllers;

import com.greenfox.splichus.services.StudentService;
import com.greenfox.splichus.services.StudentServiceTxt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerGfa {

    StudentServiceTxt studentService;

    @Autowired
    public ControllerGfa(StudentServiceTxt studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String gfa(Model model) {
        model.addAttribute("count", studentService.getCount());
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String list(Model model) {
        model.addAttribute("list", studentService.findAll());
        return "list";
    }
    @RequestMapping("/gfa/add")
    public String list () {
        return "add";
    }
    @GetMapping("/gfa/save")
    public String save(@RequestParam(name = "name") String name, Model model) {
        if (studentService.containsStudent(name)){
            model.addAttribute("status", "alreadythere");
        } else {
            studentService.save(name);
            model.addAttribute("status", "ok");
        }
        model.addAttribute("name", name);
        return "save";
    }
    @RequestMapping("/gfa/check")
    public String check(@RequestParam(name = "name", required = false) String name, Model model){
        if (studentService.containsStudent(name)){
            model.addAttribute("status", "exists");
        } else {
            model.addAttribute("status", "notexists");
        }
        model.addAttribute("name", name);
        return "check";
    }
}
