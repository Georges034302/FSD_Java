package lab5.bank;

import java.util.List;

public class Bank {

        public static void main(String[] args) {
            double balance = 1000;

            System.out.print("Start Banking(d/w/s/x): ");
            char choice = In.nextChar();

            while (choice != 'x') {

                switch (choice) {
                    case 'd': {
                        System.out.print("Amount to deposit $");
                        double amount = In.nextDouble();
                        balance += amount;
                        System.out.printf("Amount deposited $%.2f%n", amount);
                    }
                        break;
                    case 'w': {
                        System.out.print("Amount to withdraw $");
                        double amount = In.nextDouble();
                        in.nextLine();
                        if (balance >= amount) {
                            balance -= amount;
                            System.out.printf("Amount withdrawn $%.2f%n", amount);
                        } else {
                            System.out.println("Insufficient funds");
                        }
                    }
                        break;
                    case 's': {
                        System.out.printf("Starting balance $%.2f%n", balance);

                    }
                        break;
                    default:
                        System.out.println("Unknown choice!");
                        break;
                }
                System.out.print("Continue Banking(d/w/s/x): ");
                choice = In.nextChar();
            }
        }
}
