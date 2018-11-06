package com.greenfox.splichus.bankofsimba.controllers;

import com.greenfox.splichus.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAcountController {

    @GetMapping(value = "/show")
    public String show(Model model) {
        BankAccount account = new BankAccount("Simba", "2000", "lion");
        model.addAttribute("name", account.getName());
        model.addAttribute("balance", account.getBalance());
        model.addAttribute("animalType", account.getAnimalType());
        return "show";

    }
}
