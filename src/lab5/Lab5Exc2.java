package lab5;

import java.util.Arrays;
import java.util.Random;

public class Lab5Exc2 {
    public static void main(String[] args) {
        int[] numbers = numbers();
        System.out.println(Arrays.toString(numbers));
        show("Mean", mean(numbers));
        show("Stdv", stdv(numbers));
    }
    
    public static int[] numbers() {
        int[] temp = new int[20];
        Random r = new Random();

        for (int i = 0; i < temp.length; i++) {
            temp[i] = r.nextInt(101);
        }

        return temp;
    }

    public static double mean(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
    
    public static double stdv(int[] numbers) {
        double mean = mean(numbers);
        double variance = 0;

        for (int i = 0; i < numbers.length; i++) {
            variance += Math.pow(mean - numbers[i], 2) / numbers.length;
        }

        return Math.sqrt(variance);
    }
    
    public static void show(String prompt, double value) {
        System.out.printf(prompt + " = %.3f %n", value);
    }
}
