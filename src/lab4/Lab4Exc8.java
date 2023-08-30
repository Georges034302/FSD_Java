package lab4;

import utils.In;

public class Lab4Exc8 {
    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = In.nextInt();
        int f = 1;

        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial("+n+") = "+f);
    }
}
