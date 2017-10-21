package NimMainFiles;


public class HumanPlayer implements Player
{
    private int numberOfMarblesToTake;
    
    public HumanPlayer()
    {
        
    }
    
    public int move()
    {
        return numberOfMarblesToTake;
    }
    
    public void setNumberOfMarblesToTake(int marbleNum)
    {
        numberOfMarblesToTake=marbleNum;
    }
    
    public String getName()
    {
        return "Human player";
    }
}
