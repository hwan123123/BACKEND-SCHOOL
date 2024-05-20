package com.example.day08.Exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class AccountNotFoundException extends Exception {
        public AccountNotFoundException(String message) {
            super(message);
        }
    }

    class Bank {
        public String name;
        public List<Account> accounts;

        public Bank(String name) {
            this.name = name;
            this.accounts = new ArrayList<>();
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public Account getAccount(int accountNumber) throws AccountNotFoundException {
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    return account;
                }
            }
            throw new AccountNotFoundException("Account with account number " + accountNumber + " not found.");
        }
    }

    class Account {
        public int accountNumber;
        public String ownerName;
        public double balance;

        public Account(int accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = 0;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds to withdraw " + amount + " from account " + accountNumber);
            }
            balance -= amount;
        }

        public int getAccountNumber() {
            return accountNumber;
        }
    }

    class Banker {
        public String name;
        public String bankerId;

        public Banker(String name, String bankerId) {
            this.name = name;
            this.bankerId = bankerId;
        }

        public void approveAccount(Bank bank, Account account) {
            bank.addAccount(account);
        }

        public void approveWithdrawal(Bank bank, int accountNumber, double amount) throws AccountNotFoundException, InsufficientFundsException {
            Account account = bank.getAccount(accountNumber);
            account.withdraw(amount);
        }
    }
}
