import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Manager admin;
    private List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) { 
        new Bank().menu();      
    }

    public Bank(){
        this.customers.add(new Customer());
        this.customers.add(new Customer());
        this.customers.add(new Customer());
    }

    private static char readChoice(){
        System.out.print("Banking menu(L/V/X): ");
        return In.nextChar();
    }

    private void customerLogin(){
        //read the customer name
        //find if the customer exists in the list
        //login to the existing customer menu
    }

    private void view(){
        //show all customers objects
    }

    private void menu(){
        char choice = readChoice();
        while(choice != 'X'){
            switch(choice){
                case 'L':customerLogin();break;
                case 'V':view();break;
                default: help();break;
            }

            choice = readChoice();            
        }
    }

    private static void help(){
        System.out.println("L- Login to customer menu");
        System.out.println("V- View all customers");
        System.out.println("X- exit");
    }
}
