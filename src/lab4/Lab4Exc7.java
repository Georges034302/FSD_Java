package lab4;

import utils.In;

public class Lab4Exc7 {
    public static void main(String[] args) {
        System.out.print("Character: ");
        char c = In.nextChar();
        int count = 0;

        while (c != '.') {
            if ("aeiou".contains(Character.toString(Character.toLowerCase(c))))
                count++;

            System.out.print("Character: ");
            c = In.nextChar();
        }
        System.out.println("Vowel Count = "+count); 
    }
}
