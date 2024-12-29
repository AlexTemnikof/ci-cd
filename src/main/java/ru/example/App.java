package ru.example;

import ru.example.entities.Account;
import ru.example.service.TransactionServiceImpl;

public class App {
    public static void main(String[] args) {
        final TransactionServiceImpl service = new TransactionServiceImpl();
        final Account firstAccount = new Account("Temnikov");
        final Account secondAccount = new Account("Ivanov");
        service.creditAccount(firstAccount, 100);
        service.makeTransaction(firstAccount, secondAccount, 100);
        System.out.println("SUCCESS TRANSACTION!!");
        System.out.println("Second account money: " + secondAccount.getAmountOfMoney());
    }
}