package lab6.exercise2;

import utils.In;

public class Shop {
    private Product product;
    private CashRegister cashRegister;

    public static void main(String[] args) {
        new Shop().menu();
    }

    public Shop() {
        this.product = new Product("Pepsi", 3.5, 15);
        this.cashRegister = new CashRegister();
    }

    private int readQuantity() {
        System.out.print("Quantity: ");
        return In.nextInt();
    }

    private void sell() {
        int quantity = readQuantity();

        if (product.has(quantity)) {
            cashRegister.gain(product.sold(quantity));
        } else {
            System.out.println("Not enough stock!");
        }
    }

    private void restock() {
        int quantity = readQuantity();
        double amount = product.cash(quantity);

        if (cashRegister.has(amount)) {
            cashRegister.pay(product.stocked(quantity));
        } else {
            System.out.println("Not enough funds!");
        }
    }

    private void show() {
        System.out.println(product);
        System.out.println(cashRegister);
    }

    private char readChoice() {
        System.out.print("Choice(s/r/v/x): ");
        return In.nextChar();
    }

    private void help() {
        System.out.println("s - sell");
        System.out.println("r - restock");
        System.out.println("v - view");
        System.out.println("x - exit");
    }

    private void menu() {
        char c;

        while ((c = readChoice()) != 'x') {
            switch (c) {
                case 's':
                    sell();
                    break;
                case 'r':
                    restock();
                    break;
                case 'v':
                    show();
                    break;
                default:
                    help();
                    break;
            }
        }
    }
}
