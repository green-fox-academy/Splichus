package com.greenfox.splichus.bankofsimba.model;

public class BankAccount {
    String name;
    String animalType;
    String balance;

    public BankAccount(String name, String balance, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBalance() {
        return balance;
    }
}
