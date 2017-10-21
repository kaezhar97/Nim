package NimMainFiles;


public class SmartComputer implements Player
{
    private int numberOfMarblesTaken;
    public SmartComputer()
    {
        
    }
    
    public int move(int marblesLeftInPile)
    {
      
        
        if (marblesLeftInPile<=100&&marblesLeftInPile>=64)
        {
           numberOfMarblesTaken=marblesLeftInPile-63;
   
        }
        else if (marblesLeftInPile<=63&&marblesLeftInPile>=32)
        {
           numberOfMarblesTaken=marblesLeftInPile-31;
          
        }
        else if (marblesLeftInPile<=31&&marblesLeftInPile>=16)
        {
           numberOfMarblesTaken=marblesLeftInPile-15;
           
        }
        else if (marblesLeftInPile<=15&&marblesLeftInPile>=8)
        {
           numberOfMarblesTaken=marblesLeftInPile-7;
           
        }
        else if (marblesLeftInPile<=7&&marblesLeftInPile>=4)
        {
           numberOfMarblesTaken=marblesLeftInPile-3;
           
        }
        else if (marblesLeftInPile<=3&&marblesLeftInPile>=2)
        {
           numberOfMarblesTaken=marblesLeftInPile-1;
           
        }
        
      
        return numberOfMarblesTaken;
    }
    
   
    
    public String getName()
    {
        return "Smart computer";
    }
}
