package lab3.bank;

import java.util.List;
import java.util.Scanner;

public class Bank {
        static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Amount to deposit $");
            double amount = in.nextDouble();
            System.out.printf("Amount $%.2f deposited%n", amount);

            System.out.print("Amount to withdraw $");
            amount = in.nextDouble();
            System.out.printf("Amount $%.2f withdrawn%n", amount);
        }
}