package lab7.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import utils.In;

class Bank {
    static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/uuuu - HH:mm:ss");
    static LocalDateTime NOW = LocalDateTime.now();
    private List<Customer> customers;
    
    public static void main(String[] args) {
        (new Bank()).menu();
    }

    public Bank() {
        customers = new ArrayList<>();
        addCustomers();
    }

    private void addCustomers(){
        for(int i =0; i < 3 ; i++){
            this.customers.add(new Customer());
        }
    }

    private char readChoice(){
        System.out.print("Customer menu (L/V/X): ");
        return In.nextChar();
    }
    
    private Customer customer(String name){        
        for(Customer c:customers)
            if(c.match(name))
                return c;
        return null;
    }

    private String readName() {
        System.out.print("Enter Customer Name: ");
        return In.nextLine();
    }
    
    private void login() {
        Customer c = customer(readName());
        if (c != null)
            c.use();
        else
            System.out.println("Customer does not exist");
    }
    
    public void view() {
        customers.forEach(System.out::println);
    }
    
    public void menu() {
        System.out.println("Bank menu: "+DTF.format(NOW));
        char c;
        while((c = readChoice()) != 'X'){
            switch(c){
                case 'L': login(); break;
                case 'V': view(); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("L = Login into customer menu");
        System.out.println("V = View all customers");
        System.out.println("X = exit");
    }
}

