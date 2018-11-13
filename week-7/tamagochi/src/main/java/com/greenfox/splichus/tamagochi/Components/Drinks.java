package com.greenfox.splichus.tamagochi.Components;

import com.greenfox.splichus.tamagochi.Models.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Drinks {
    List<Drink> drinks;

    public Drinks() {
        drinks = new ArrayList<>();
        drinks.add(new Drink("none"));
        drinks.add(new Drink("Water"));
        drinks.add(new Drink("Coke"));
        drinks.add(new Drink("Lemonade"));
    }

    public Drink getDrink(String name) {
        return drinks.stream().filter(d -> d.getDrinkName().equals(name)).findFirst().get();
    }

    public List<Drink> getAll() {
        return drinks;
    }
}
