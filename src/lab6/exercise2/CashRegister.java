package lab6.exercise2;

public class CashRegister {
    private double cash;
    
    public CashRegister() {
    }
    
    public void gain(double amount) {
        this.cash += amount;
    }

    public void pay(double amount) {
        this.cash -= amount;
    }

    public boolean isEmpty() {
        return cash == 0;
    }

    public boolean has(double amount) {
        return cash >= amount;
    }

    @Override
    public String toString(){
        return (cash > 0 )? String.format("Cash level $%.2f", cash)
                            : "Cash register is empty";
    }
}
