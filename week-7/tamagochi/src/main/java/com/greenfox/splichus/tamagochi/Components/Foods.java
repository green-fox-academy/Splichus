package com.greenfox.splichus.tamagochi.Components;

import com.greenfox.splichus.tamagochi.Models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foods {

    List<Food> foods;

    public Foods() {
        foods = new ArrayList<>();
        foods.add(new Food("none"));
        foods.add(new Food("Grass"));
        foods.add(new Food("Mice"));
        foods.add(new Food("Pizza"));
    }

    public Food getFood(String name) {
        return foods.stream().filter(f -> f.getFoodName().equals(name)).findFirst().get();
    }

    public List<Food> getAll() {
        return foods;
    }
}
