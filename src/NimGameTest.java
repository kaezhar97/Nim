/*
    File: NimGameTest.java
    Purpose:
        Plays a game of Nim and asks the user if he or she wants to play another game of Nim.
*/

import NimMainFiles.HumanPlayer;
import NimMainFiles.Nim;
import NimMainFiles.Player;
import NimMainFiles.SmartComputer;
import NimMainFiles.StupidComputer;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * A class that tests the Nim game classes. 
 * 
 * @author Octavio Avila-Cardet
 */
public class NimGameTest 
{
    
    /*
        The main method of Nim.
    */
    public static void main (String args[])
    {
        HumanPlayer theHuman=new HumanPlayer(); // creates a human computer
        SmartComputer superComputer=new SmartComputer(); // creates a super computer
        StupidComputer dumbComputer=new StupidComputer(); // creates a dumb computer
        
        String input;
        Scanner scan;
        String answer;
        String playAgain;
        
        System.out.println("Welcome players to The Ancient and Honorable Game of Nim\n" +
"\nHere are the rules:\nTwo players takes turns removing marbles from a pile. "
                + "\nOn each turn, the player must remove at "
                + "least one but no more than half of the remaining marbles. "
                + "\nThe player who is forced to remove the last marble loses.");
        
      /*
        Plays a game and then asks the user if they want to play again.
        */
      do
      {
        /*
          Asks the user for the difficulty of the computer they want to play against.
          */
        do 
        {
         input=JOptionPane.showInputDialog("Would you like to play against \n1-Stupid computer\n2-Smart computer\nType 1 or 2");
         scan=new Scanner(input);
         answer=scan.next();
        }while(!(answer.equals("1"))&&!(answer.equals("2")));
        
        
        
        String theInput;
        Scanner scanOrder;
        String firstOrSecond;
        
        theInput=JOptionPane.showInputDialog("Would you like to go first or second.\nType 1 or 2");
        scanOrder=new Scanner(theInput);
        firstOrSecond=scanOrder.next();
        
        /*
            Asks the user if they want to go first or second.
        */
        while( !(firstOrSecond.equals("1")) && !(firstOrSecond.equals("2")) )
        {
            theInput=JOptionPane.showInputDialog("Please only type 1 or 2.\nWould you like to go first or second");
            scanOrder=new Scanner(theInput);
            firstOrSecond=scanOrder.next();
        }
        
        if((answer.equals("1"))&&(firstOrSecond.equals("1")))
        {
           Player[] thePlayers= {theHuman, dumbComputer};
           Nim nimGame = new Nim (thePlayers);
           
           System.out.println(nimGame.play());
        }
        else if((answer.equals("1"))&&(firstOrSecond.equals("2")))
        {
            Player[] thePlayers= {dumbComputer, theHuman};
            Nim nimGame = new Nim (thePlayers);
            
            System.out.println(nimGame.play()); 
        }
        else if((answer.equals("2"))&&(firstOrSecond.equals("1")))
        {
            Player[] thePlayers= {theHuman, superComputer};
            Nim nimGame = new Nim (thePlayers);
            System.out.println(nimGame.play()); 
        }
         else if((answer.equals("2"))&&(firstOrSecond.equals("2")))
        {
             Player[] thePlayers= {superComputer, theHuman};
             Nim nimGame = new Nim (thePlayers);
             System.out.println(nimGame.play());    
        }
        
        input=JOptionPane.showInputDialog("Would you like to play another game.\nType y or n");
        scan=new Scanner (input);
        playAgain=scan.next();
        
        while (!(playAgain.toLowerCase().equals("y")) && !(playAgain.toLowerCase().equals("n")))
        {
            input=JOptionPane.showInputDialog("Invalid input. Please only type either a 'y' or an 'n'.\nWould you like to play another game");
            scan=new Scanner (input);
            playAgain=scan.next();           
        }
         
      }while(playAgain.toLowerCase().equals("y")); 
      
    }
}
