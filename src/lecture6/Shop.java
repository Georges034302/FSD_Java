package lecture6;

import utils.In;

public class Shop {
    private Product product;
    private CashRegister register;

    public Shop() {
        this.product = new Product("Pepsi", 4.5, 10);
        this.register = new CashRegister();
    }
    
    private int readQuantity() {
        System.out.print("Quantity: ");
        return In.nextInt();
    }

    private void sell() {
        int quantity = readQuantity();
        if (product.has(quantity)) {
            double cash = product.sold(quantity);
            register.gain(cash);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    private void restock() {
        int quantity = readQuantity();
        double cash = product.cash(quantity);

        if (register.has(cash)) {
            cash = product.stocked(quantity);
            register.pay(cash);
        } else {
            System.out.println(("Not enough funds!"));
        }
    }
    
    private void view() {
        System.out.println(product);
        System.out.println(register);
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
                    view();
                    break;
                default:
                    help();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Shop().menu();
    }

}
