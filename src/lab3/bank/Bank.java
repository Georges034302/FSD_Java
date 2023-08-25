package lab3.bank;

import utils.In;

public class Bank {
    private Customer customer;

    public Bank() {
        this.customer = new Customer("John Smith", new Account("Savings", 1000));
    }

    private double readAmount(String action) {
        System.out.print("Amount to " + action + " $");
        return In.nextDouble();
    }

    private void deposit(double amount) {
        this.customer.deposit(amount);
    }

    private void withdraw(double amount) {
        this.customer.withdraw(amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        double amount = bank.readAmount("deposit");
        bank.deposit(amount);
        System.out.printf("Amount %.2f deposited%n", amount);
        amount = bank.readAmount("withdraw");
        bank.withdraw(amount);
        System.out.printf("Amount %.2f withdrawn%n", amount);

        
    }

}
