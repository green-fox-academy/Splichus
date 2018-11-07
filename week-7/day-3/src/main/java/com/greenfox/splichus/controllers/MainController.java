package com.greenfox.splichus.controllers;

import com.greenfox.splichus.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    UtilityService utilityService;

    @Autowired
    public MainController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String useful() {
        return "useful";
    }
    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }
    @RequestMapping("/useful/email")
    public String email(@RequestParam(name="email", required = false) String email, Model model){
        if (email.contains(".") && email.contains("@")) {
            model.addAttribute("valid", "yes");
        } else {
            model.addAttribute("valid", "no");
        }
        return "email";
    }
    @RequestMapping("/useful/caesar")
    public String caesar(@RequestParam(name = "text", required = false) String text,
                         @RequestParam(name = "number", required = false) Integer number, Model model){
        String coded="";
        if (text != null) {
            for (int i = 0; i < text.length(); i++) {
                coded += String.valueOf((int) text.charAt(i) + number);
            }
            model.addAttribute("coded", coded);
        }
        return "caesar";
    }
}
