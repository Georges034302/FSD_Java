package lab4;

import utils.In;

public class Lab4Exc3 {
    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = In.nextInt();

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }

            System.out.println();
            System.out.print("n  = ");
            n = In.nextInt();
        }
    }
}
