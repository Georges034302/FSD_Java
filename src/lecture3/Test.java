package lecture3;

import java.util.*;

public class Test {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("String: ");
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++)
            if ("aeiou".contains(""+s.charAt(i)))
                System.out.println(s.charAt(i));
    }
}
