package com.greenfox.splichus.week9day1.models;

import java.util.ArrayList;
import java.util.List;

public class ArraysResult {

    Object result;
    String error;

    public ArraysResult(String what, int[] numbers) {
        if (what == null || numbers == null){
            error = "Please provide what to do with the numbers!";
        } else if (what.equals("sum")) {
            Integer sum = 0;
            for (int i = 0; i < numbers.length ; i++) {
                sum+=numbers[i];
            }
            this.result = sum;
        } else if (what.equals("multiply")) {
            Integer multiplicant = 1;
            for (int i = 0; i < numbers.length ; i++) {
                multiplicant*=numbers[i];
            }
            this.result = multiplicant;
        } else if (what.equals("double")) {
            List<Integer> doubler = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                doubler.add(numbers[i]*2);
                this.result = doubler;
            }
        }
    }

    public Object getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
