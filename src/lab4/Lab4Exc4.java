package lab4;

import utils.In;

public class Lab4Exc4 {
    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = In.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (n != 0) {
            if (n >= max)
                max = n;
            if (n <= min)
                min = n;
            System.out.print("n  = ");
            n = In.nextInt();
        }
        System.out.println("Min = "+min+
                            "\nMax = "+max);          
    }
}
