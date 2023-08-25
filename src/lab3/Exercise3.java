package lab3;

import utils.In;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Radius = ");
        double radius = In.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double volume = Math.PI * Math.pow(radius, 3)*(4/3.0);
        System.out.printf("Circle area of radius %.2f is: %.2f%n", radius, area);
        System.out.printf("Sphere volume of radius %.2f is: %.2f%n", radius,volume);
    }
}

