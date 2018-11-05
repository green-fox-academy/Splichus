package com.greenfox.firstwebapp.com.greenfox.firstwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping(value = "/helloworld")
    public String helloWorld(Model model) {
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        String[] color = {"black", "yellow", "blue", "green", "orange", "violet", "red", "brown"};
        String[] size = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        model.addAttribute("language", hellos[(int)(Math.random()*hellos.length)]);
        model.addAttribute("color", color[(int)(Math.random()*color.length)]);
        model.addAttribute("size", size[(int)(Math.random()*10)]);
        return "greetingColors";
    }
}
