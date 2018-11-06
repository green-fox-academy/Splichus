package com.greenfox.splichus.bankofsimba.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAcounts {
    List<BankAccount> accounts = new ArrayList<>();

    public BankAcounts() {

        accounts.add(new BankAccount("Scar", "3000", "Lion"));
        accounts.add(new BankAccount("Mufasa", "500", "Lion"));
        accounts.add(new BankAccount("Rafiki", "20000000", "The seer"));
        accounts.add(new BankAccount("Timon", "200", "Meerkat"));
        accounts.add(new BankAccount("Ed", "23760", "Hyena"));
        accounts.add(new BankAccount("Simba", "298698", "Lion"));
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

