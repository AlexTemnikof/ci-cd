package ru.example.entities;

import ru.example.util.IdGenerator;

public class Account {

    private int id;

    private String surname;

    private long amountOfMoney;

    public Account(final String surname) {
        this.id = IdGenerator.generateRandomId();
        this.surname = surname;
        this.amountOfMoney = 0;
    }

    public void addMoney(final long money) {
        this.amountOfMoney += money;
    }

    public boolean decreaseMoney(final int transactionAmount) {
        if (amountOfMoney - transactionAmount < 0) {
            return false;
        }

        amountOfMoney -= transactionAmount;
        return true;
    }

    public long getAmountOfMoney() {
        return amountOfMoney;
    }
}
