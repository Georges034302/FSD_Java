import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Manager admin;
    private List<Customer> customers = new ArrayList();
    static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    static LocalDateTime NOW = LocalDateTime.now();

    public static void main(String[] args) { 
        new Bank().menu();      
    }

    public Bank(){
        this.customers.add(new Customer());
        this.customers.add(new Customer());
        this.customers.add(new Customer());
    }

    private static char readChoice(){
        System.out.print("Choices(L/V/X): ");
        return In.nextChar();
    }

    private String readName(){
        System.out.print("Name: ");
        return In.nextLine();
    }

    private Customer customer(String name){
        for (Customer customer : customers) {
            if (customer.match(name))
                return customer;
        }
        return null;
    }

    private void customerLogin(){
        //read the customer name
        String name = readName();
        //find if the customer exists in the list
        Customer customer = customer(name);        
        //login to the existing customer menu
        if(customer != null)
            customer.menu();
        else
            System.out.println(name+" does not exist");
    }

    private void view(){
        // show all customers objects
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        
    }

    private void menu(){
        System.out.println("Banking menu "+DTF.format(NOW));
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
