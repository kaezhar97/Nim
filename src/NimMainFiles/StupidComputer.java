
package NimMainFiles;

import java.util.Random;


public class StupidComputer implements Player
{
    public int move(int numberOfMarblesTaken)
    {
        Random ranMarbles = new Random();
        numberOfMarblesTaken=ranMarbles.nextInt(Pile.getSize()+1)+1; // Picks a random number of marbles
        return numberOfMarblesTaken;
    }
    
    public String getName()
    {
        return "Stupid computer";
    }
            
}
