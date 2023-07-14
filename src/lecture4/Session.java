package lecture4;

/*
 * Enter password from STDIN until * is entered
 * 
 * verify the password against the following regular expression pattern:
 * password pattern: [A-Z][a-z]{6,}\\d{2,}
 * 
 * password pattern meaning: 
 *  - password should start with uppercase character
 *  - followed by 6 or more lowercase characters 
 *  - followed by 2 or more digits
 * 
 */
import utils.*;

public class Session {
    public static void main(String[] args) {
        String pattern = "[A-Z][a-z]{6,}\\d{2,}";

        System.out.print("Password: ");
        String password = In.nextLine();

        while (!password.equals("*")) {
            if (password.matches(pattern)) {
                System.out.println("correct password");
            } else {
                System.out.println("incorrect password!");
            }

            System.out.print("Password: ");
            password = In.nextLine();
        }
    }
}
