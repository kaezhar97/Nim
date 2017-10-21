
package NimMainFiles;

import java.util.Random;


public class StupidComputer implements Player
{
    private int numberOfMarblesToTake;
    
    public StupidComputer()
    {
        
    }
    public int move()
    {
        Random ranMarbles = new Random();
        numberOfMarblesToTake=ranMarbles.nextInt( (Pile.getSize()/2)+1)+1; // Picks a random number of marbles
        return numberOfMarblesToTake;
    }
    
    
    public String getName()
    {
        return "Stupid computer";
    }
            
}
