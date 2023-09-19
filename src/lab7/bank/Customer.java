import java.util.List;

public class Customer {
    private String name;
    private Account savings;
    private Account loan;

    public Customer(String name){
        this.name= name;
        this.savings = new Account("Savings");
        this.loan = new Account("Loan");
    }

    public Customer(){
        this.name= readName();
        this.savings = new Account("Savings");
        this.loan = new Account("Loan");
    }

    private String readName(){
        System.out.print("Name: ");
        return In.nextLine();
    }

    public boolean match(String name){
        return this.name.equals(name);
    }

    private double readAmount(String action){
        System.out.print("Amount to "+action+": $");
        return In.nextDouble();
    }

    public void deposit(){
        double amount = readAmount("deposit");
        this.savings.deposit(amount);
    }

    public void withdraw(){
        double amount = readAmount("withdraw");
        if(savings.has(amount)){
            savings.withdraw(amount);
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public void transfer(){
        double amount = readAmount("transfer");
        if(savings.has(amount)){
            savings.transfer(amount, loan);
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public void show(){
        System.out.println(this);
    }

    private char readChoice(){
        System.out.print(this.name+" banking menu(d/w/t/s/x): ");
        return In.nextChar();
    }

    public void menu(){
        char choice = readChoice();
        while(choice != 'x'){
            switch(choice){
                case 'd':deposit();break;
                case 'w':withdraw();break;
                case 't':transfer();break;
                case 's':show();break;
                default: help();break;
            }

            choice = readChoice();            
        }
    }

    private static void help(){
        System.out.println("d- deposit");
        System.out.println("w- withdraw");
        System.out.println("t- transfer");
        System.out.println("s- show");
        System.out.println("x- exit");
    }

    @Override
    public String toString(){
        String output = this.name+"\t --> "+savings.toString()+" | "+loan.toString();
        return output;
    }
 }