package com.greenfox.splichus.bankofsimba.controllers;

import com.greenfox.splichus.bankofsimba.model.BankAccount;
import com.greenfox.splichus.bankofsimba.model.BankAcounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.RoundingMode;

@Controller
public class BankAcountController {

    @GetMapping(value = "/show")
    public String show(Model model) {
        BankAccount account = new BankAccount("Simba", "2000", "lion");
        model.addAttribute("name", account.getName());
        model.addAttribute("balance", account.getBalance().setScale(2, RoundingMode.HALF_UP));
        model.addAttribute("animalType", account.getAnimalType());
        return "show";

    }
    @GetMapping("/htmlception")
    public String htmlception(Model model) {
        model.addAttribute("string1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }
    @GetMapping("/showall")
    public String showall(Model model) {
        model.addAttribute("list", new BankAcounts().getAccounts());
        return "showall";
    }
}
