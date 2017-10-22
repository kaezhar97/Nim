/*
    File: StupidComputer.java
    Purpose:
        To simulate a computer player who plays the game with no strategy.
*/

package NimMainFiles;

import java.util.Random;

/**
 * The stupid computer will remove a random number of marbles from the pile.
 * 
 * @author Octavio Avila-Cardet
 */
public class StupidComputer implements Player
{
    private int numberOfMarblesToTake; //Number of marbles the computer will take from pile.
    
    /**
     * Creates a stupid computer.
     */
    public StupidComputer()
    {
        
    }

    
    /**
     * Gets a random numer of marbles from the pile from 1 to half the pile size.
     * 
     * @param marblesLeftInPile the number of marbles left in the pile.
     * @return the number of marbles the computer removed from the pile.
     */
    public int move(int marblesLeftInPile)
    {
        Random ranMarbles = new Random();
        
        int halfOfMarblesInPile=marblesLeftInPile/2;
        
        numberOfMarblesToTake=ranMarbles.nextInt(halfOfMarblesInPile)+1; // Picks a random number of marbles.
 
        return numberOfMarblesToTake;
    }

    /**
     * Gets this player's name.
     * 
     * @return the stupid computer's name as a string.
     */
    public String getName()
    {
        return "Stupid computer";
    }
            
}
