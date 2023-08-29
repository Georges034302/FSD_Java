import java.util.List;
import java.util.Scanner;

public class Bank {
    private Manager admin;
    private List<Customer> customers;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 1000;

        System.out.print("Start Banking(d/w/s/x): ");
        char choice = in.nextLine().charAt(0);

        while(choice != 'x'){

            switch(choice){
                case 'd':{

                }break;
                case 'w':{

                }break;
                case 's':{

                }break;
                default: System.out.println("Unknown choice!"); break;
            }
            System.out.print("Continue Banking(d/w/s/x): ");
            choice = in.nextLine().charAt(0);
        }
        
    }
}
