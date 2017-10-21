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
        int answer;
        
        do 
        {
         input=JOptionPane.showInputDialog("Would you like to play against \n1-Stupid computer\n2-Smart computer\nType 1 or 2");
         scan=new Scanner(input);
         answer=scan.nextInt();
        }while((answer!=1)&&(answer!=2));
        
        
        int order;
        String theInput;
        Scanner scanOrder;
        int firstOrSecond;
        
        theInput=JOptionPane.showInputDialog("Would you like to go first or second.\nType 1 or 2");
        scanOrder=new Scanner(theInput);
        firstOrSecond=scanOrder.nextInt();
        
        while(firstOrSecond!=1&&firstOrSecond!=2)
        {
            theInput=JOptionPane.showInputDialog("Please only type 1 or 2.\nWould you like to go first or second");
            scanOrder=new Scanner(theInput);
            firstOrSecond=scanOrder.nextInt();
        }
        
        if(answer==1&&firstOrSecond==1)
        {
           Player[] thePlayers= {theHuman, dumbComputer};
           Nim nimGame = new Nim (thePlayers);
           
           System.out.println(nimGame.play());
        }
        else if(answer==1&&firstOrSecond==2)
        {
            Player[] thePlayers= {dumbComputer, theHuman};
            Nim nimGame = new Nim (thePlayers);
            
            System.out.println(nimGame.play()); 
        }
        else if(answer==2&&firstOrSecond==1)
        {
            Player[] thePlayers= {theHuman, superComputer};
            Nim nimGame = new Nim (thePlayers);
            System.out.println(nimGame.play()); 
        }
         else if(answer==2&&firstOrSecond==2)
        {
             Player[] thePlayers= {superComputer, theHuman};
             Nim nimGame = new Nim (thePlayers);
             System.out.println(nimGame.play());    
        }
        
        
    }
}
