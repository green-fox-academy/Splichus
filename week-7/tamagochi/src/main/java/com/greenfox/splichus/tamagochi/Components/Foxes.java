package com.greenfox.splichus.tamagochi.Components;

import com.greenfox.splichus.tamagochi.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Foxes {
    List<Fox> foxes;

    public Foxes() {
        this.foxes = new ArrayList<>();

    }

    public void add(Fox fox) {
        foxes.add(fox);
    }

    public Fox get(String name) {
        for (int i = 0; i < foxes.size() ; i++) {
            if (foxes.get(i).getName().equals(name)){
                return foxes.get(i);
            }
        }
        return null;
    }
}
