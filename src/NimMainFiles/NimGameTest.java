package NimMainFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class NimGameTest 
{
    public static void main (String args[])
    {
        Pile gamePile=new Pile();
        System.out.println("The starting pile has "+gamePile.getSize()+" marbles");
        
        HumanPlayer theHuman=new HumanPlayer();
        SmartComputer superComputer=new SmartComputer();
        StupidComputer dumbComputer=new StupidComputer();
        
        String input=JOptionPane.showInputDialog("Would you like to play against \n1-Stupid computer\nSmart computer\nType 1 or 2");
        Scanner scan=new Scanner(input);
        int answer=scan.nextInt();
        
        if(answer==1)
        {
           Nim nimGame=new Nim(theHuman,dumbComputer,gamePile); 
        }
        else
        {
            Nim nimGame=new Nim(theHuman,superComputer,gamePile); 
        }
        
    }
}
