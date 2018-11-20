package com.greenfox.splichus.week9day1.models.Input;

public class RecievedNumber {

    Integer until;

    public RecievedNumber() {
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    @Override
    public String toString() {
        return "\"until\": \""+until+"\"";
    }
}
