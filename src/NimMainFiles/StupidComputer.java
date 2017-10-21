
package NimMainFiles;

import java.util.Random;


public class StupidComputer implements Player
{
    public StupidComputer()
    {
        
    }
    public int move()
    {
        
        Random ranMarbles = new Random();
        int numberOfMarblesTaken=ranMarbles.nextInt((Pile.getSize()/2)+1)+1; // Picks a random number of marbles
        return numberOfMarblesTaken;
    }
    
    public String getName()
    {
        return "Stupid computer";
    }
            
}
