package lab9.game;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author George
 */
public class Player implements Serializable{
    private String name;
    private int score;
    private int number;
    
    public Player(int number){
        this.name = "Player_"+number;
        this.number = number;
        this.score = (new Random()).nextInt(11);
    }
    
    @Override
    public String toString(){
        return this.name+" score: "+score;
    }
}
