# Nim
A school assignment that simulates a game of Nim

Computer Programming II			    	    Instructor: Greg Shaw
COP 3337							    

 
	Programming Assignment #4

Interfaces and Polymorphism


The Ancient and Honorable Game of Nim

Nim is an ancient game with several variations.  Here’s one: Two players takes turns removing marbles from a pile. On each turn, the player must remove at least one but no more than half of the remaining marbles. The player who is forced to remove the last marble loses.


 The Assignment

	Write a Java program in which the computer plays against a human opponent. 

	Begin each game by asking the human whether she wants to go first or second, and whether she wants to play against a smart computer or a stupid computer.
StupidComputer objects remove a random number of marbles between 1 and n/2, inclusive, each turn. (Where n is the number of marbles in the pile)
SmartComputer objects remove exactly enough marbles to make the remaining pile a power of two minus one (1, 3, 7, 15, 31, or 63).

A SmartComputer cannot be beaten if it has the first move, unless the initial pile size is 15, 31, or 63.  Naturally, a human who plays first and knows the winning strategy is also invincible.

	Begin each game with a pile of between 10 and 100 marbles, inclusive, where the size is set randomly. 

After each turn, print out the player name (human’s actual name or computer name), how many marbles the player took, and the number of marbles remaining.   

	When each game ends the winner should be announced and the human asked whether she wants to play again.  If so, she must be able to choose her opponent and whether to go first or second



Specifications

To receive credit for this assignment, you must create a Java interface called Player, and 3 classes that implement it – one class for each of the 3 kinds of players.  The interface will declare an abstract move method that returns the number of marbles taken and an abstract getName method that returns the player’s name
Although the Measurable interface demonstrates static and default methods in addition to abstract methods, your Player interface will have abstract methods only (i.e. move and getName)

Implement another class called Nim with a play method  that conducts the game, as shown in class. The play method must call the move method polymorphically

Design the move method of the HumanPlayer class so that the human is not allowed to “cheat” by removing an illegal number of marbles.  (You know how those humans are)

Design the move method of the SmartComputer class so that the computer is not allowed to “cheat” either.  (Once they get smart, no telling what those computers might do)

Implement another class called Pile to create and maintain a pile of marbles

Your test class will create the Player objects, the Nim object, and call the play method.  After each game, ask whether the user wants to play again
The Nim class must depend only on the Player interface and Pile class, and not on any of the classes that implement the Player interface

Hint: Create the Player objects in your test class (or in a separate PlayerGenerator class) and pass them to the Nim constructor, or to the play method. You may pass the individual objects or an array containing the objects, your choice
The individual player classes and the Pile class must not depend on one another or on the Nim class

Recall that class A “depends on” class B if A creates objects of B, declares object variables of B (including method parameters), calls static methods of B, or accesses static constants of B


 Due Date:   Tuesday, October 24th


What to Upload

Upload a zip file containing your project folder.

No need to submit any output.  The graders will test your program rigorously, just like you did before submitting it.


 Purpose

The purpose of this assignment is twofold:

1. To show you that although you are only midway through your second programming class, you have the ability to write an awesome game!

2. To understand the benefits of interfaces and how to write one along with some classes that implement it

Again, interfaces promote software extensibility. I.e. new classes may be added to the system with no modification of existing classes  
For full credit, your Nim class should not have to be modified in any way if a new class of Player is created. Otherwise, you are missing the point of the assignment and the rationale behind interfaces


Examples

	For examples of interfaces, classes that implement them, and classes that depend only on the interface and not on any of the implementing classes, see the SeniorCitizenMcDonald and Measurable programs, online


 Extra for Experts

	Modify the move method of your SmartComputer class so that it can work with a pile of any size.  Hint:  replace your if-else logic with a loop
