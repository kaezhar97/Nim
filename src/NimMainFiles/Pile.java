package NimMainFiles;
import java.util.Random;


public class Pile 
{
    private static int pileSize;
    
    public Pile()
    {
        Random pileGenerator = new Random();
        pileSize=pileGenerator.nextInt(91)+10; // Generates a random pile size between 10 and 100 inclusive
    }
    
    public static int getSize()
    {
        return pileSize;
    }
}
