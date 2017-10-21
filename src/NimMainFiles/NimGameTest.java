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
        
        String input;
        Scanner scan;
        int answer;
        
        do 
        {
         input=JOptionPane.showInputDialog("Would you like to play against \n1-Stupid computer\n2-Smart computer\nType 1 or 2");
         scan=new Scanner(input);
         answer=scan.nextInt();
        }while((answer!=1)&&(answer!=2));
        
        if(answer==1)
        {
           Nim nimGame=new Nim(theHuman,dumbComputer,gamePile);
           System.out.println(nimGame.play());
        }
        else
        {
            Nim nimGame=new Nim(theHuman,superComputer,gamePile);
            System.out.println(nimGame.play());
        }
        
    }
}
