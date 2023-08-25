package lab3;

import utils.In;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = In.nextInt();
        int[] numbers = new int[n];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 10;
        numbers[numbers.length - 1] = -5;
        numbers[numbers.length / 2] = 3;
        System.out.println(Arrays.toString(numbers));
    }    
}
