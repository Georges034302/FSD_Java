package lab3;

import utils.*;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("x = ");
        int x = In.nextInt();

        System.out.print("y = ");
        int y = In.nextInt();

        double z = Math.pow(x, y);
        double result = Math.sqrt(z);

        System.out.printf("z = %.2f%n", z);
        System.out.printf("result = %.2f%n", result);
    }
}
