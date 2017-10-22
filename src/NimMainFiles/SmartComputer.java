/*
   File: SmartComputer.java
   Purpose:
       To simulate a real life smart computer player. The smart computer will use a winning strategy at all times.
 */

package NimMainFiles;

/**
 * The smart computer will use an algorithm to win at all times. The smart computer is invincible if it goes first during the game of Nim 
 * unless the initial pile size is 15, 31, or 63.
 * 
 * @author Octavio Avila-Cardet
 */
public class SmartComputer implements Player
{
    private int numberOfMarblesTaken; //Number of marbles that the smart computer has taken from the pile.
    
    /**
     * Creates a smart computer.
     */
    public SmartComputer()
    {
        
    }
    
    /**
     * The move method of the smart computer will remove a number of marbles such that the remaining marbles in the pile is
     * equal to a power of two minus 1 (1, 3, 7, 15, 31, 63, etc).
     * 
     * @param marblesLeftInPile
     * @return 
     */
    public int move(int marblesLeftInPile)
    {
      
        
        if (marblesLeftInPile<=100&&marblesLeftInPile>=64)
        {
           numberOfMarblesTaken=marblesLeftInPile-63;
   
        }
        else if (marblesLeftInPile<=63&&marblesLeftInPile>=32)
        {
           numberOfMarblesTaken=marblesLeftInPile-31;
          
        }
        else if (marblesLeftInPile<=31&&marblesLeftInPile>=16)
        {
           numberOfMarblesTaken=marblesLeftInPile-15;
           
        }
        else if (marblesLeftInPile<=15&&marblesLeftInPile>=8)
        {
           numberOfMarblesTaken=marblesLeftInPile-7;
           
        }
        else if (marblesLeftInPile<=7&&marblesLeftInPile>=4)
        {
           numberOfMarblesTaken=marblesLeftInPile-3;
           
        }
        else if (marblesLeftInPile<=3&&marblesLeftInPile>=2)
        {
           numberOfMarblesTaken=marblesLeftInPile-1;
           
        }
        
      
        if (numberOfMarblesTaken>(marblesLeftInPile/2))
        {
            numberOfMarblesTaken--;
        }
        
        return numberOfMarblesTaken;
    }
    
   
    /**
     * Gets this player's name.
     * 
     * @return the smart computer's name as a string.
     */
    public String getName()
    {
        return "Smart computer";
    }
}
