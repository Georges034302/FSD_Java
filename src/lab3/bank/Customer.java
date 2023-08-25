package lab3.bank;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.account = account;
        this.name = name;
    }

    public void deposit(double amount) {
        this.account.deposit(amount);
    }

    public void withdraw(double amount) {
        this.account.deposit(amount);
    }

    public void show() {
        System.out.println(account);
    }
    
    @Override
    public String toString() {
        return "Customer [name=" + name + "]";
    }    
}
