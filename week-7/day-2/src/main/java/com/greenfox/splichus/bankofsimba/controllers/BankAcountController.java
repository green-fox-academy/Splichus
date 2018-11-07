package com.greenfox.splichus.bankofsimba.controllers;

import com.greenfox.splichus.bankofsimba.model.BankAccount;
import com.greenfox.splichus.bankofsimba.model.BankAcounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Controller
public class BankAcountController {

    BankAcounts accounts = new BankAcounts();

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
    public String showall(String name, Model model) {
        for (int i = 0; i < accounts.getAccounts().size(); i++) {
            if (accounts.getAccounts().get(i).getName().equals(name)){
                if (name.equals("Simba")){
                    accounts.getAccounts().get(i).setBalance(accounts.getAccounts().get(i).getBalance().add(new BigDecimal("100")));
                } else {
                    accounts.getAccounts().get(i).setBalance(accounts.getAccounts().get(i).getBalance().add(new BigDecimal("10")));
                }
            }
        }
        model.addAttribute("list", accounts.getAccounts());
        return "showall";
    }
}
