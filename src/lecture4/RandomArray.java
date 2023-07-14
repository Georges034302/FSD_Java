package lecture4;

/*
 * Create a random integer array of size n (from STDIN) and seed 100
 * Calculate and show the min, max, total, and average values
 */

import java.util.Random;
import utils.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = In.nextInt();

        int numbers[] = new int[n];
        Random r = new Random();

        for(int i=0; i < numbers.length; i++)
            numbers[i] = r.nextInt(100);
            
        System.out.println(Arrays.toString(numbers));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;        

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println("Min = "+min+"\n"+
                            "Max = "+max+"\n"+
                            "Sum = " + sum +"\n" +
                            "Average = "+avg);
    }
}
