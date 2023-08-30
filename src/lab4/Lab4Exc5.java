package lab4;

import utils.In;

public class Lab4Exc5 {
    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = In.nextInt();

        while (n != -1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    sum += i;
            }
            System.out.printf("Even-sum(%2d) = %2d %n", n,sum);
            System.out.print("n  = ");
            n = In.nextInt();
        }     
    }
}
