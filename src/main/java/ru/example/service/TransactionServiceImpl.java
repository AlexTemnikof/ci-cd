package ru.example.service;

import ru.example.entities.Account;

public class TransactionServiceImpl {

    public boolean makeTransaction(final Account firstAccount, final Account secondAccount, final int amount) {
        if (!firstAccount.decreaseMoney(amount)) {
            return false;
        }

        secondAccount.addMoney(amount);
        return true;
    }

    public void creditAccount(final Account account, final int amount) {
        account.addMoney(amount);
    }
}
