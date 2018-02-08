package w4d2StudyHall;

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class HangmanGame{
	/* Replace this line with a proper header which includes your name */

	private static String usersName;
	private static String inputFromUser;
	private static String theAnswer;
	private static char menuCharacter;
	static String [] secretWords = {"massive", "wonderful", "trouble", "theoretical", "unlimited",
			"talented", "tasteful", "intellectual", "ordinary", "winner",
			"master", "difficult", "success", "happy", "picture"};
	static Random random = new Random();
	
	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
	int Won = 0;
	int Lose = 0;
		
		Scanner keyboard = new Scanner(System.in);


		/* Welcome the user and request the user to enter a name */
		System.out.println("Welcome!");
		
		System.out.println("Please enter your name followed by a return");
		
		/* Read in the user's name */
		 usersName=keyboard.next();
		
	while (true) {
		if (Won + Lose <= 6) {
			/* Display menu */
			System.out.println(usersName+ ",Please enter a command letter followed by a return");	
			System.out.println(" p -> Play the game");
			System.out.println(" s -> View statistics");
			System.out.println(" q -> Quit");

			
				 /* Read the menu character */
			 inputFromUser =keyboard.next();
			 
			/* Play the game? */
			 if (inputFromUser.equals("p")) {
				 System.out.println("Play the game command recognized ");
				 System.out.println("Start the game (y/n) ");
				inputFromUser =keyboard.next();
				if (inputFromUser.equals("y"));{
			int max = 15;
			int min = 1;
			int diff=max-min;
			Random random = new Random();
			int i = random.nextInt(diff+1);
			i+=min;
			System.out.println("The random number is " + i);
			if (i == 1) {
				String theWord = "MASSIVE";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("S")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 2) {
				String theWord = "WONDERFUL";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(4);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("E")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 3) {
				String theWord = "TROUBLE";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2 );
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("O")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 4) {
				String theWord = "THEORETICAL";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(5);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("E")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 5) {
				String theWord = "UNLIMITED";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(4);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("M")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 6) {
				String theWord = "TALENTED";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(0);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("T")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 7) {
				String theWord = "TASTEFUL";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("S")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 8) {
				String theWord = "INTELLECTUAL";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("T")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 9) {
				String theWord = "ORDINARY";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("S")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 10) {
				String theWord = "WINNER";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(1);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("I")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 11) {
				String theWord = "MASTER";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(0);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("M")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 12) {
				String theWord = "DIFFICULT";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(0);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("D")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 13) {
				String theWord = "SUCCESS";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("C")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 14) {
				String theWord = "HAPPY";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(2);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("P")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}
			else if (i == 15) {
				String theWord = "PICTURE";
				String theResult = theWord;
				
				char aCharacter = '?';
				aCharacter = theWord.charAt(1);
				theResult = theResult.replace(aCharacter, '?');
				System.out.println("the display version of the word is: "+theResult);
		System.out.println("Guess the character");
		theAnswer = keyboard.next();
		if (theAnswer.equals("I")) {
			System.out.println("The Secret Word is : " +theWord+ "and you have won the game");
			Won++;
		} else  {
			System.out.println("The Secret word is:" +theWord+ "you have lose the game, Please try again");
			Lose++;
		}	
			}

			 }
			 }
			/* View the statistics? */
			 else if (inputFromUser.equals("s")) {
				 System.out.println(" View the statistics command recognized");
				 System.out.println("No. of games won:" +Won);
				 System.out.println("no. of games lose:" +Lose);
			 }
			 
			/* Quit the game? */
			 else if (inputFromUser.equals("q")) {
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
		else {
			System.out.println("No. of games won:" +Won);
			System.out.println("No. of games lose:" +Lose);
			System.out.println("No more chances left");
			System.out.println("Thankyou For Playing the game");
			return;
		}
	}
	
}}
