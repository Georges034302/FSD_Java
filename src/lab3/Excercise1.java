package lab3;

public class Excercise1 {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        System.out.printf("x+y = %07.3f%n", (double) x + y);
        System.out.printf("x-y = %07.3f%n", (double) x - y);
        System.out.printf("x*y = %07.3f%n", (double) x * y);
        System.out.printf("x/y = %07.3f%n", (double) x / y);
        System.out.printf("x%%y+x/y = %07.3f%n", (x % y) + (double) x / y);
        double result = (Math.pow(y, 7)/(Math.sqrt(5)+x)) * (Math.pow(x,4)%5 + 2);
        System.out.printf("Result = %07.3f%n", result);
    }
}
