/*
   File: HumanPlayer.java
   Purpose:
       To simulate a real life human player playing Nim.
 */

package NimMainFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * A human player can select how many marbles they want to remove from the pile. They can only remove half or less of the number of 
 * marbles left in the pile.
 * 
 * @author Octavio Avila-Cardet
 */
public class HumanPlayer implements Player
{
    private int numberOfMarblesToTake; //Number of marbles that the human will take from the pile.
    
    /**
     * Creates a human player.
     */
    public HumanPlayer()
    {
        
    }
    
    /**
     * Asks the user how many marbles does he or she want to remove from the pile. Checks that the amount to remove is valid.
     * 
     * @param marblesLeftInPile The number of marbles left in the pile.
     * @return The number of marbles taken from the pile.
     */
    public int move(int marblesLeftInPile)
    {
        String input;
        Scanner scan;
        
       do
       {
        input= JOptionPane.showInputDialog("How many marbles would you like to remove?\n\nCannot remove more than half of marbles in pile");
        scan = new Scanner (input);
        numberOfMarblesToTake=scan.nextInt();
       }while( (numberOfMarblesToTake==0) || (numberOfMarblesToTake>(marblesLeftInPile/2)) );
      
        
        
        return numberOfMarblesToTake;
    }
    
   
 
    /**
     * Gets this player's name.
     * 
     * @return the human player's name as a string.
     */
    public String getName()
    {
        return "Human player";
    }
}
