package com.greenfox.splichus.tamagochi.Components;

import com.greenfox.splichus.tamagochi.Models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tricks {
    List<Trick> tricks;

    public Tricks() {
        tricks = new ArrayList<>();
        tricks.add(new Trick("jump"));
        tricks.add(new Trick("throw"));
        tricks.add(new Trick("squeak"));
        tricks.add(new Trick("roll"));
        tricks.add(new Trick("code in Java"));
        tricks.add(new Trick("code in Java Script"));
        tricks.add(new Trick("style with CSS"));
    }
    public Trick getTrick(String name) {
        return tricks.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public List<Trick> getAll() {
        return tricks;
    }
}
