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
        if (dumbComputer==null)
        {
            while (thePile.getSize()>1)
            {
                if(order==1)
                {
                    int marblesRemovedBySmartComputer=superComputer.move();
                    thePile.removeMarbles(marblesRemovedBySmartComputer);
                    System.out.println("The " +superComputer.getName()+" has removed "+marblesRemovedBySmartComputer+" marbles from the pile");
                    System.out.println("There are now "+thePile.getSize()+" marbles left");
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
                        scan=new Scanner(humanInput);
                        humanMarblesToRemove=scan.nextInt();
                    }
                    
                    theHuman.setNumberOfMarblesToTake(humanMarblesToRemove);
                    thePile.removeMarbles(theHuman.move());
                    System.out.println("The " +theHuman.getName()+" has removed "+theHuman.move()+" marbles from the pile");
                    System.out.println("There are now "+thePile.getSize()+" marbles left");
                    
                    order=1;
                }
                
                if (thePile.getSize()==1&&order==1)
                {
                    winner=theHuman.getName()+ " wins";
                }
                else if (thePile.getSize()==1&&order==0)
                {
                    winner=superComputer.getName()+ " wins";
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
                    int marblesRemovedByDumbComputer=dumbComputer.move();
                    
                    if (marblesRemovedByDumbComputer==2&&thePile.getSize()<=3)
                    {
                        marblesRemovedByDumbComputer=1;
                    }
                    
                    
                    thePile.removeMarbles(marblesRemovedByDumbComputer);
                    order=0;
                    System.out.println("The " +dumbComputer.getName()+" has removed "+marblesRemovedByDumbComputer+" marbles from the pile");
                    System.out.println("There are now "+thePile.getSize()+" marbles left");
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
                        scan=new Scanner(humanInput);
                        
                        humanMarblesToRemove=scan.nextInt();

                    }
                    
                    theHuman.setNumberOfMarblesToTake(humanMarblesToRemove);
                    thePile.removeMarbles(theHuman.move());
                    System.out.println("The " +theHuman.getName()+" has removed "+theHuman.move()+" marbles from the pile");
                    System.out.println("There are now "+thePile.getSize()+" marbles left");
                    
                    order=1;
                }
                
                if (thePile.getSize()==1&&order==1)
                {
                    winner=theHuman.getName()+ " wins";
                }
                else if (thePile.getSize()==1&&order==0)
                {
                    winner=dumbComputer.getName()+ " wins";
                }
 
            }
        }
        
        return winner;
    }
}
