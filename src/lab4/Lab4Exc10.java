package lab4;

import utils.In;

class Lab4Exc10{
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int Fn = 0;

        System.out.print("n  = ");
        int n = In.nextInt();

        for (int i = 2; i < n; i++) {
            Fn = first + second;           
            System.out.printf("F0(%2d) - F1(%2d) = %3d %n", first, second, Fn);
            first = second;
            second = Fn;
        }
    }
}