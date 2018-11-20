package com.greenfox.splichus.week9day1.models.Input;

import java.lang.reflect.Array;

public class RecievedArray {
    int[] numbers;
    String what;

    public RecievedArray() {
    }

    public RecievedArray(String what, int[] numbers) {
        this.numbers = numbers;
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String getWhat() {
        return what;
    }

    @Override
    public String toString() {
        return "\"what\": \""+what+"\", \"numbers\": \""+numbers.toString()+"\"";
    }
}

