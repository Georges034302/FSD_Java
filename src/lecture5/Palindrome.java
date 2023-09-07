package lecture5;

import utils.In;

/*
 * Read a string from STDIN until *
 * determine if any of the strings is a palindrome
 * 
 */
/*
 * Top level: determine and show palindrome strings
 * second: check if a string is a palindrome
 * third: determine the reverse of a string
 */
public class Palindrome {

    public static void main(String[] args) {
        String s = "";

        while (!(s = readString()).equals("*")) {
            System.out.println(isPalindrome(s)?s+" is Palindrome": s+" is not Palindrome");
        }
    }
    
    public static String readString() {
        System.out.print("String: ");
        return In.nextLine();
    }

    public static boolean isPalindrome(String s) {
        int mid = (s.length()%2 == 0) ? s.length()/2 : s.length()/2 +1;
        String left = s.substring(0, mid);
        String right = s.substring(s.length() / 2, s.length());
        return left.equals(reverseString(right));
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
