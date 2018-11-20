package com.greenfox.splichus.week9day1.models;

public class DoUntil {

    Integer result;
    String error;

    public DoUntil(String what, Integer number) {
        if (number != null) {
            if (what.equals("factor")){
                Integer fact = 1;
                for (int i = 1; i <= number ; i++) {
                    fact*=i;
                }
                this.result = fact;
            } else if (what.equals("sum")){
                Integer sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                this.result = sum;
            }
        } else {
            error = "Please provide a number!";
        }
    }

    public Integer getResult() {
        return result;
    }


}
