package lab5.bank;
import utils.In;

public class Bank {

    private double balance;

    public Bank() {
        this.balance = 1000;
    }

    private double readAmount(String action) {
        System.out.print("Amount to " + action + " $");
        return In.nextDouble();
    }

    private void deposit() {
        double amount = readAmount("deposit");
        this.balance += amount;
        System.out.printf("Amount %.2f deposited%n", amount);
    }

    private void withdraw() {
        double amount = readAmount("withdraw");
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.printf("Amount %.2f withdrawn%n", amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void show() {
        System.out.printf("Starting balance $%.2f%n", this.balance);
    }

    private char readChoice() {
        System.out.print("Start Banking (d/w/s/x): ");
        return In.nextChar();
    }
    
    private void help() {
        System.out.println("d - deposit");
        System.out.println("w - withdraw");
        System.out.println("s - show");
        System.out.println("x - exit");
    }
    
    private void menu() {
        char c;
        while ((c=readChoice()) != 'x') {
            switch (c) {
                case 'd':
                    deposit();
                    break;
                case 'w':
                    withdraw();
                    break;
                case 's':
                    show();
                    break;
                default:
                    help();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Bank().menu();
    }
}
