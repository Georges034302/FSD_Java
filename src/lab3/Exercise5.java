package lab3;

import utils.In;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("String: ");
        String s = In.nextLine();

        System.out.println("First character: " + s.charAt(0));
        System.out.println("Last character: " + s.charAt(s.length()-1));
        System.out.println("Lowercase s: " + s.toLowerCase());
        System.out.println("String length: "+s.length());
    }
}
