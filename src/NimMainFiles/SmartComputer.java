package NimMainFiles;


public class SmartComputer implements Player
{
    private int numberOfMarblesTaken;
    public SmartComputer()
    {
        
    }
    
    public int move(int marblesLeftInPile)
    {
      
        
        if (Pile.getSize()<=100&&Pile.getSize()>=64)
        {
           numberOfMarblesTaken=Pile.getSize()-63;
   
        }
        else if (Pile.getSize()<=63&&Pile.getSize()>=32)
        {
           numberOfMarblesTaken=Pile.getSize()-31;
          
        }
        else if (Pile.getSize()<=31&&Pile.getSize()>=16)
        {
           numberOfMarblesTaken=Pile.getSize()-15;
           
        }
        else if (Pile.getSize()<=15&&Pile.getSize()>=8)
        {
           numberOfMarblesTaken=Pile.getSize()-7;
           
        }
        else if (Pile.getSize()<=7&&Pile.getSize()>=4)
        {
           numberOfMarblesTaken=Pile.getSize()-3;
           
        }
        else if (Pile.getSize()<=3&&Pile.getSize()>=2)
        {
           numberOfMarblesTaken=Pile.getSize()-1;
           
        }
        
      
        return numberOfMarblesTaken;
    }
    
   
    
    public String getName()
    {
        return "Smart computer";
    }
}
