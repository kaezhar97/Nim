package NimMainFiles;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Nim 
{

    private Pile thePile;
    private Player[] myPlayers;
   
    
    
    public Nim(Player[] myPlayers)
    {
        this.myPlayers=myPlayers;
        this.thePile=new Pile();
        
    }
 
    
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
        
        return winner + " has won!" + "\n\nGAME OVER"
                + "";
    }
    
    public boolean gameOver(boolean isOver)
    {
        return isOver;
    }
    
    
    
}
