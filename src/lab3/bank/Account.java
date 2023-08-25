package lab3.bank;

import utils.In;

public class Account {
    private String type;
    private double balance;

    public Account(String type, double balance) {
        this.balance = balance;
        this.type = type;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void payTo(double amount, Account target) {
        this.balance -= amount;
        target.balance += amount;
    }

    @Override
    public String toString() {
        return String.format("Starting balance: %.2f", balance);
    }       
}
