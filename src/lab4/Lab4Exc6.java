package lab4;

import java.util.Random;

import utils.In;

public class Lab4Exc6 {
    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = In.nextInt();

        Random r = new Random();
        int i = 0;
        int sum = 0;

        while (i < n) {
            int value = r.nextInt(10);
            if (value % 2 == 0)
                sum += value;
            i++;          
        }
        System.out.printf("Even sum = %2d %n", sum); 
    }
}
