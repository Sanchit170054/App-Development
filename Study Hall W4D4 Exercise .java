package w4d2StudyHall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class W4D4StudyHallExercise {

	/**********************************************************************************************
	 * The following static variables are used by the main method to hold the key state and 
	 * objects that must exist and be available across the various methods of this class (the
	 * mainline).
	 */

	static Scanner keyboard = new Scanner(System.in);		// The scanner for the keyboard
	static String [] secretWords;						// This array holds the secret words
	static Random random = new Random();					// A random number generator

	/**********
	 * This private method reads in a list of words from a specified input file
	 * 
	 * @param theFileName	A String parameter that specifies the name of the file to use
	 * @return				The methods returns an array of words if the file is there
	 * 
	 * @exception			A File not found exception results in program termination
	 */
	private static String[] readInTheWords(String theFileName){
		// Set up local variable so the method can read the file that contains the secret words
		// based on the name that is passed into the method via theFileName parameter.
		Scanner fileReader = null;		// Establish a local variable outside the try/catch
										// block so it will be available after it completes
		try {							
			// Try opening the file and set up a scanner to read it.  If the file is there,
			// the program will continue to the statement following this try/ctach block.
			fileReader = new Scanner(new File(theFileName));
		} catch (FileNotFoundException e) {
			// If the file is not there, an exception will be thrown and the program flow
			// will directed here.  An error message is displayed tp the console and the 
			// program stops.
			System.out.println("*** Error *** The file 'SecretWords.txt' was not found!");
			System.out.println("The program terminates with an error now.");
			System.exit(0);
		}

		// If we get here, the file is there and can be read.  So we use the "hasNextInt" method
		// to see if there is a number in the first line that we can used to determine how many 
		// words to read in.  
		int numWords = 0;				// Establish a local variable of the number of words
										// here so it will be available after the if statement.
		if (fileReader.hasNextInt()) {
			numWords = fileReader.nextInt();
		} else {
			System.out.println("*** Error *** The first line of file 'SecretWords.txt' does not "
					+ "start with and integer that specifies the number of secret words to be "
					+ "read!");
			System.out.println("The program terminates with an error now.");
			System.exit(0);
		}

		// If we get here, it means that the file containing the secret words properly start with
		// an integer. We then use that integer to allocate an array of just the right size 
		String [] words = new String[numWords];

		// We then use the size to drive a for loop to read in the words and store them into
		// the array, converting the letters to UPPER CASE
		for (int ndx = 0; ndx < numWords; ndx ++)
			if (fileReader.hasNext())
				words[ndx] = fileReader.next().toUpperCase();
			else {
				// If we get here, it means that we have run out of words to be read in before we
				// have filled the array of words.  Therefore, we will inform the user of this 
				// error condition and terminate the program.
				System.out.println("*** Error *** The file does not contain enough secret word to "
						+ "satisfy the number specified at the beginning of the file!");
				System.out.println("The program terminates with an error now.");
				System.exit(0);
			}
		// If we get here, it means we found enough words to fill the array, but there may still 
		// have a problem.  There could be more words left in the file, so this check sees if the
		// fileReader has exhausted all of the data in the file.

		if (fileReader.hasNext()) {
			// If we get here, there is more data in the file, when it should be at the end, so
			// we will issue another error message to address this situation.
			System.out.println("*** Error *** The file has provided enough data to satisfy the "
					+ "the integer at the beginning of the file, but there is more data left "
					+ "to be read!");
			System.out.println("The program terminates with an error now.");
			System.exit(0);
		}

		return words;
	}

	public static void main(String[] args) {
		// Try to read in the array of words and store them into the class instance variable
		secretWords = readInTheWords("SecretWords.txt");

		// If the execution reaches this point, the reading was successfully accomplished,
		// so inform the user of this
		System.out.println("The program has successfully read in the set of secret words.");
		System.out.println();
		
		// Display the words in a nicely formatted list
		System.out.println("The follwing are those words:");
		int numSecretWords = secretWords.length;
		for (int ndx = 0; ndx < numSecretWords; ndx++)
			System.out.println("  "+ (ndx < 9 ? " " : "") + (ndx+1) + " " + secretWords[ndx]);
		System.out.println();			// Append an empty line at the end of the list.
		
		// The program has successfully done its work
		System.out.println("The program successfully terminates now.");
	}

}
