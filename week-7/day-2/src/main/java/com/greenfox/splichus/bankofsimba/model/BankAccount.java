package com.greenfox.splichus.bankofsimba.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    String name;
    String animalType;
    BigDecimal balance;
    boolean isKing = false;
    String isBad;

    public BankAccount(String name, String balance, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.balance = new BigDecimal(balance);
        if (name.equals("Simba")) isKing = true;
        if (name.equals("Scar")) isBad = "bad";
        else isBad = "good";
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getBalanceToPrint() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    public boolean isKing() {
        return isKing;
    }

    public String isBad() {
        return isBad;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
