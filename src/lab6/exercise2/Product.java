package lab6.exercise2;

import utils.In;

public class Product {
    private String type;
    private double price;
    private int quantity;

    public Product(String type, double price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
        this.type = readType();
        this.price = readPrice();
        this.quantity = readQuantity();
    }

    private String readType() {
        System.out.print("Type: ");
        return In.nextLine();
    }

    private double readPrice() {
        System.out.print("Price $ ");
        return In.nextDouble();
    }

    private int readQuantity() {
        System.out.print("Quantity: ");
        return In.nextInt();
    }

    public boolean isEmpty() {
        return quantity == 0;
    }

    public double stocked(int stock) {
        quantity += stock;
        return stock * price;
    }

    public double sold(int stock) {
        quantity -= stock;
        return stock * price;
    }

    public boolean has(int stock) {
        return quantity >= stock;
    }

    public double cash(int stock) {
        return stock * price;
    }

    @Override
    public String toString() {
        return (quantity > 0 ) ? String.format("%-8s level: %3d at price $%.2f", type,quantity,price)
                                : String.format("%-8s level is: %3d", type,quantity);
    }
}
