package NimMainFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class HumanPlayer implements Player
{
    private int numberOfMarblesToTake;
    
    public HumanPlayer()
    {
        
    }
    
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
    
   
 
    
    public String getName()
    {
        return "Human player";
    }
}
