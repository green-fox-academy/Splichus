package com.greenfox.splichus.tamagochi.Models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    List<Trick> tricks;
    Drink drink;
    Food food;
    List<String> log;


    public Fox(String name, Trick trick, Food food, Drink drink) {
        tricks = new ArrayList<>();
        log = new ArrayList<>();
        this.name = name;
        tricks.add(trick);
        this.food = food;
        this.drink = drink;
        log.add(DateTimeFormatter.ofPattern("dd-mm-YYYY HH:mm:ss").format(LocalDateTime.now())+"   Created");
    }

    public String getName() {
        return name;
    }
    public List<Trick> getTricks() {
        return tricks;
    }
    public Food getFood() {
        return food;
    }
    public Drink getDrink() {
        return drink;
    }
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    public void setFood(Food food) {
        this.food = food;
    }
    public void addTrick(Trick trick) {
        tricks.add(trick);
    }
    public void addToLog(String text){
        log.add(text);
    }
    public List<String> getLog() {
        if (log.size()>=5) {
            return log.subList(log.size()-5, log.size());
        }
        return log;
    }
}
