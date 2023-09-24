package lab7;

public class Money {
    private int value;
    
    public Money(int value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return "note of $"+this.value;
    }
}
