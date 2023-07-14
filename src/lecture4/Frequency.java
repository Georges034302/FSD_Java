package lecture4;

/*
 * Read integers between 1 and 100 until -1
 * Show the frequency of integer-group: 
 * Groups are: 0-9, 10-19, 20-29, 30-39, ..., 90-99.
 */

import utils.*;

public class Frequency {
    public static void main(String[] args) {
        //group container
        int[] count = new int[10];

        System.out.print("value = ");
        int value = In.nextInt();

        while (value != -1) {
            count[value / 10]++;

            System.out.print("value = ");
            value = In.nextInt();
        }

        for (int i = 0; i < count.length; i++) {
            int start = 10 * i;
            int end = start + 9;
            System.out.println(start+"-"+end+": "+count[i]);
        }
    }
}
