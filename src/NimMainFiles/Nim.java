package NimMainFiles;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Nim 
{
    private HumanPlayer theHuman;
    private SmartComputer superComputer;
    private StupidComputer dumbComputer;
    private Pile thePile;
    
    
    public Nim(HumanPlayer aHuman, SmartComputer superComp, Pile aPile)
    {
        theHuman = aHuman;
        superComputer=superComp;
        thePile=aPile;
    }
    
     public Nim(HumanPlayer aHuman,  StupidComputer dumbComp, Pile aPile)
    {
        theHuman = aHuman;
        dumbComputer=dumbComp;
        thePile=aPile;
    }
    
    public String play()
    {
        Random orderGenerator = new Random();
        int order=orderGenerator.nextInt(2)+1;
        String humanInput;
        Scanner scan;
        int humanMarblesToRemove;
        String winner="";
        
        
        //superComputer vs theHuman
        if (superComputer!=null)
        {
            while (thePile.getSize()>1)
            {
                if(order==1)
                {
                    thePile.removeMarbles(superComputer.move());
                    order=0;
                }
                else
                {
                    humanInput=JOptionPane.showInputDialog("How many marbles would you like to remove?");
                    scan=new Scanner(humanInput);
                    humanMarblesToRemove=scan.nextInt();
        
                    while (humanMarblesToRemove>(thePile.getSize())/2)
                    {
                        humanInput=JOptionPane.showInputDialog("Can't remove more than half of the marbles. "
                                + "\nHow many marbles would you like to remove?");
                        humanMarblesToRemove=scan.nextInt();
                    }
                    
                    order=1;
                }
                
                if (thePile.getSize()==1&&order==1)
                {
                    winner="The Human player wins";
                }
                else if (thePile.getSize()==1&&order==0)
                {
                    winner="The Smart computer wins";
                }
 
            }
        }
        //dumbComputer vs theHuman
        else
        {
            while (thePile.getSize()>1)
            {
                if(order==1)
                {
                    thePile.removeMarbles(dumbComputer.move());
                    order=0;
                }
                else
                {
                    humanInput=JOptionPane.showInputDialog("How many marbles would you like to remove?");
                    scan=new Scanner(humanInput);
                    humanMarblesToRemove=scan.nextInt();
        
                    while (humanMarblesToRemove>(thePile.getSize())/2)
                    {
                        humanInput=JOptionPane.showInputDialog("Can't remove more than half of the marbles. "
                                + "\nHow many marbles would you like to remove?");
                        humanMarblesToRemove=scan.nextInt();
                    }
                    
                    order=1;
                }
                
                if (thePile.getSize()==1&&order==1)
                {
                    winner="The Human player wins";
                }
                else if (thePile.getSize()==1&&order==0)
                {
                    winner="The Dumb computer wins";
                }
 
            }
        }
        
        return winner;
    }
}
