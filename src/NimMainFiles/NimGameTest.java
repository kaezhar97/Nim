package NimMainFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class NimGameTest 
{
    public static void main (String args[])
    {
       
   
        
        HumanPlayer theHuman=new HumanPlayer();
        SmartComputer superComputer=new SmartComputer();
        StupidComputer dumbComputer=new StupidComputer();
        
        String input;
        Scanner scan;
        String answer;
        String playAgain;
        
      do
      {
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
