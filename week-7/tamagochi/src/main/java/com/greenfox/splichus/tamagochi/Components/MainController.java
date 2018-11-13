package com.greenfox.splichus.tamagochi.Components;

import com.greenfox.splichus.tamagochi.Models.Fox;
import com.greenfox.splichus.tamagochi.Models.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    Foxes foxes;
    Drinks drinks;
    Foods foods;
    Tricks tricks;
    DateTimeFormatter format;

    @Autowired
    public MainController(Foxes foxes, Drinks drinks, Foods foods, Tricks tricks) {
        this.foxes = foxes;
        this.drinks = drinks;
        this.foods = foods;
        this.tricks = tricks;
        foxes.add(new Fox("Mr.Fox", tricks.getTrick("jump"), foods.getFood("Pizza"), drinks.getDrink("Lemonade")));
        format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }

    @RequestMapping({"/info"})
    public String index(String name, String newfox, Model model) {
        model.addAttribute("fox", foxes.get(name));
        model.addAttribute("log", foxes.get(name).getLog());
        model.addAttribute("newFox", newfox);
        return "index";
    }
    @GetMapping("/")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam(name = "name") String name, Model model){
        if (name.isEmpty()) {
            return "redirect:/";
        } else if (foxes.get(name) == null) {
            foxes.add(new Fox(name, tricks.getTrick("jump"), foods.getFood("none"), drinks.getDrink("none")));
            model.addAttribute("fox", foxes.get(name));
            return "redirect:/info?name="+name+"&newfox=yes";
        } else {
            model.addAttribute("fox", foxes.get(name));
            return "redirect:/info?name="+name;
        }
    }
    @GetMapping("/store")
    public String store(@RequestParam() String name, Model model) {
        model.addAttribute("fox", foxes.get(name));
        model.addAttribute("drinks", drinks.getAll());
        model.addAttribute("foods", foods.getAll());
        return "store";
    }
    @PostMapping("/change")
    public String change(String food, String drink, String name, Model model) {
        if (!foxes.get(name).getDrink().getDrinkName().equals(drink)){
            foxes.get(name).addToLog(format.format(LocalDateTime.now())+"   Drink changed to: "+drink);
        }
        if (!foxes.get(name).getFood().getFoodName().equals(food)){
            foxes.get(name).addToLog(format.format(LocalDateTime.now())+"   Food changed to: "+food);
        }
        foxes.get(name).setDrink(drinks.getDrink(drink));
        foxes.get(name).setFood(foods.getFood(food));
        model.addAttribute("fox", foxes.get(name));
        return "redirect:/info?name="+name;
    }
    @GetMapping("/tricks")
    public String tricks(String name, Model model) {
        List<Trick> notLearned = new ArrayList<>();
        for (int i = 0; i < tricks.getAll().size() ; i++) {
            if (!foxes.get(name).getTricks().contains(tricks.getAll().get(i))){
                notLearned.add(tricks.getAll().get(i));
            }
        }
        model.addAttribute("fox", foxes.get(name));
        model.addAttribute("tricks", notLearned);
        return "tricks";
    }
    @PostMapping("/addtrick")
    public String addTrick(String name, String trick, Model model) {
        foxes.get(name).addToLog(format.format(LocalDateTime.now())+"   Learned a new trick: "+trick);
        foxes.get(name).addTrick(tricks.getTrick(trick));
        model.addAttribute("fox", foxes.get(name));
        return "redirect:/info?name="+name;
    }
    @GetMapping("/log")
    public String log(String name, Model model) {
        model.addAttribute("fox", foxes.get(name));
        model.addAttribute("log", foxes.get(name).getLog());
        return "log";
    }


}
