/*
   File: Player.java
   Purpose:
       An interface for the player classes of the Nim game.
 */

package NimMainFiles;

/**
 * The interface Player allows the classes that implement it to make moves polymorphically and to get their respective names.
 * 
 * @author Octavio Avila-Cardet
 */
public interface Player 
{
   int move(int marblesLeftInPile); //The move method takes the number of marbles left and returns the number of marbles removed from the pile.
   String getName(); //Returns the name of the player. The name varies based on the player for which this method is called.
}
