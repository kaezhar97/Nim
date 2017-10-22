/*
    File: Nim.java
    Purpose:
        To simulate a real life game of Nim. Nim is an ancient game with several variations.  Here’s one: Two players takes turns 
removing marbles from a pile. On each turn, the player must remove at least one but no more than half of the remaining marbles. 
The player who is forced to remove the last marble loses.
*/

package NimMainFiles;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * A class that simulates a Nim game.
 * 
 * @author Octavio Avila-Cardet
 */
public class Nim 
{

    private Pile thePile; //The pile where the marbles will be taken from
    private Player[] myPlayers; //All the players playing the current game
   
    
    /**
     * Create a Nim game with a pile and all the players.
     * 
     * @param myPlayers the list of the players playing the game. Either smart computer vs human or dumb computer vs human 
     */
    public Nim(Player[] myPlayers)
    {
        this.myPlayers=myPlayers;
        this.thePile=new Pile();
        
    }
 
    /**
     * Plays the game of Nim. Each player takes turns removing marbles from the pile. Prints out the number of marbles each player removed after
     * each turn.
     * 
     * @return who the winner is
     */
    public String play()
    {
        System.out.println("\n------------------Starting new game------------------\n"
                + "");
        System.out.println("The starting pile has "+thePile.getSize()+" marbles\n");
       
        
        String winner="";
        int marblesRemoved=0;
        
        
        
        for (int i=0;i<myPlayers.length;i++)
        {
            marblesRemoved=myPlayers[i].move(thePile.getSize());
            
            if (thePile.getSize()<=3)
            {
                marblesRemoved=1;
            }
            
            thePile.removeMarbles(marblesRemoved);
            System.out.println(myPlayers[i].getName()+" has removed "+marblesRemoved+" marbles from the pile");
            System.out.println("There are now "+thePile.getSize()+" marbles left in the pile\n");
            
            
            if (thePile.getSize()==1)
            {
                winner=myPlayers[i].getName();
                break;
            }
            
            else if (i==myPlayers.length-1&&thePile.getSize()>1)
            {
                i=-1;
            }
            
        }
        
        gameOver(true);
        
        return winner + " has won!" + "\n\n----------------------GAME OVER----------------------\n"
                + "";
    }
    
    /**
     * Determines whether or not the game is over.
     * 
     * @param isOver whether or not the game is over. If isOver is true then game is over
     * @return whether or not the game is over
     */
    public boolean gameOver(boolean isOver)
    {
        return isOver;
    }
    
    
    
}
