/*
    File: Pile.java
    Purpose:
        Simulates a pile of marbles.
*/

package NimMainFiles;
import java.util.Random;

/**
 * Manages the pile of marbles to be used throughout the game of Nim. 
 * 
 * @author Octavio
 */
public class Pile 
{
    private static int pileSize;
    /**
     * Creates a pile with a random number of marbles from 10 to 100.
     */
    public Pile()
    {
        Random pileGenerator = new Random();
        pileSize=pileGenerator.nextInt(91)+10; // Generates a random pile size between 10 and 100 inclusive
    }
    
    /**
     * Removes a specified number of marbles from the pile.
     * 
     * @param numberOfMarblesToRemove the number of marbles that is going to subtracted from the pile.
     */
    public void removeMarbles(int numberOfMarblesToRemove)
    {

        pileSize=pileSize-numberOfMarblesToRemove;

    }
    
    /**
     * Obtains the current number of marbles left in the pile.
     * 
     * @return the number of marbles left in the pile.
     */
    public int getSize()
    {
        return pileSize;
    }
}
