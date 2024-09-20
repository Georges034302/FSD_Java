package lab7;

import utils.In;
import java.util.*;

public class Wallet{
    private Stack<Money> fives;
    private Stack<Money> tens;
    private Stack<Money> twenties;
    private Stack<Money> fifties;
    private Stack<Money> hundreds;
    private int price;
    private int coins;
    
    public Wallet(){
        this.fives = stacked(5);
        this.tens = stacked(10);
        this.twenties = stacked(20);
        this.fifties = stacked(50);
        this.hundreds = stacked(100);
    }
    
    private Stack<Money> stacked(int value){
        Stack<Money> note = new Stack();
        for(int i=0; i<10; i++)
            note.push(new Money(value));
        return note;
    }
    
    private int readPrice(){
        System.out.print("Price $");
        return In.nextInt();
    }
    
    private void pay(){
        int price = readPrice();
        this.price = price;
        
        while(price >= 5){//use notes as long as price is greater than 5
            if(price >= 100){
                hundreds.pop();
                price -= 100;
            }else if(price >= 50){
                price -= 50;
                fifties.pop();
            }else if(price >= 20){
                price -= 20;
                twenties.pop();
            }else if(price >= 10){
                price -= 10;
                tens.pop();
            }else if(price >= 5){
                price -= 5;
                fives.pop();
            }
        }
        this.coins = price; //using coins
    }
    
    private int used(Stack<Money> note){
        return 10 - note.size();
    }
    
    private String note(Stack<Money> note){
        String output = (used(note) >= 0) ? used(note)+" "+note.get(0):"";
        return "- uses "+output;
    }
    
    private void show(){
        pay();
        System.out.println("Wallet \n"
                            +note(hundreds)+"\n"
                            +note(fifties)+"\n"
                            +note(twenties)+"\n"
                            +note(tens)+"\n"
                            +note(fives)+"\n"
                            +"- used $"+this.coins+" coins\n");
    }
    
    public static void main(String[] args){
        (new Wallet()).show();
    }
}