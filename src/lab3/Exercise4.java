package lab3;

import utils.In;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("x1 = ");
        int x1 = In.nextInt();
        System.out.print("y1 = ");
        int y1 = In.nextInt();
        System.out.print("x2 = ");
        int x2 = In.nextInt();
        System.out.print("y2 = ");
        int y2 = In.nextInt();

        double distance = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
        System.out.printf("Distance between A(%d,%d) and B(%d,%d) is: %.2f%n", x1, y1, x2, y2, distance);
    }
}
