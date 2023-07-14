package lecture4;

/*
 * Read month and day from STDIN
 * Calculate and show the total days from beginning of the year until the day
 * 
 * NOTE: Assume there is no leap year
 */

 import utils.*;

public class TotalDays {
    public static void main(String[] args) {
        System.out.print("Day: ");
        int day = In.nextInt();

        System.out.print("Month: ");
        int month = In.nextInt();

        int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int total = 0;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        total += day;

        System.out.println("Total days = "+total);
    }
}
