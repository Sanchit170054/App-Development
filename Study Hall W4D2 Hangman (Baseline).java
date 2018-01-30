package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/* Replace this line with a proper header which includes your name */

	private static String usersName;
	private static String inputFromUser;
	private static char menuCharacter;

	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
		
		Scanner keyboard = new Scanner(System.in);
 

		/* Welcome the user and request the user to enter a name */
		System.out.println("Welcome!");
		
		System.out.println("Please enter your name followed by a return.");
		
		/* Read in the user's name */
		 usersName=keyboard.next();
		 
	while (true) {
			/* Display menu */
			System.out.println(usersName+ ",Please enter a command letter followed by a return !");	
			System.out.println(" p -> Play the game");
			System.out.println(" s -> View statistics");
			System.out.println(" q -> Quiet");
			
				 /* Read the menu character */
			 inputFromUser =keyboard.next().trim();
			 
			/* Play the game? */
			 if (inputFromUser.equals(" p ")) {
				 System.out.println("Play the game command recognized. ");
			 }
			 
			/* View the statistics? */
			 else if (inputFromUser.equals(" s ")) {
				 System.out.println(" View the statistics command recognized.");
			 }
			 
			/* Quit the game? */
			 else if (inputFromUser.equals(" q ")) {
				 System.out.println("Quit the game command recognized");
				 System.out.println("Thanks for playing,"+usersName);
			 }
			/* Display error (if command is none of the above) */
			 else {
				 System.out.println("*** Error ***");
				 System.out.println("Invalid menu item entered. It must be p, s, or q!");
				 System.out.println("The input found was:" +inputFromUser);
			 }
	}
	}
}
