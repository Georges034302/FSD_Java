package lab4;

import java.util.Random;

import utils.In;

public class Lab4Exc9 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10) + 1;
        System.out.print("Guess  = ");
        int guess = In.nextInt();

        while (guess != n) {
            System.out.println("Sorry - try again!");
            System.out.print("Guess  = ");
            guess = In.nextInt();
        }
        System.out.println("Success, secret number = "+guess);
    }
}
