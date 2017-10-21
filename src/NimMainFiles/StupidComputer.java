
package NimMainFiles;

import java.util.Random;


public class StupidComputer implements Player
{
    private int numberOfMarblesToTake;
    private int marblesLeft;
    
    public StupidComputer()
    {
        
    }

    
    
    public int move(int marblesLeftInPile)
    {
        Random ranMarbles = new Random();
        
        int halfOfMarblesInPile=marblesLeftInPile/2;
        
        numberOfMarblesToTake=ranMarbles.nextInt(halfOfMarblesInPile)+1; // Picks a random number of marbles
 
        return numberOfMarblesToTake;
    }

    
    public String getName()
    {
        return "Stupid computer";
    }
            
}
