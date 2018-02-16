package w6D5StudyHallExemplar;

import java.util.Scanner;

public class W6D5StudyHallErrorTerm {
	/**
	 * <p> Title: W6D5StudyHallErrorTerm. </p>
	 * 
	 * <p> Description: A demonstration of the mechanical translation of Finite State Machine 
	 * diagram into an executable Java program using the error term recognizer. </p>
	 * 
	 * <p> Copyright: Lynn Robert Carter Â© 2018 </p>
	 * 
	 * @author Lynn Robert Carter
	 * 
	 * @version 0.00	2018-01-28	Initial baseline 
	 * 
	 */
	
	/**********
	 * This private method display the input line and then on a line under it displays an up arrow
	 * at the point where an error was detected.
	 * 
	 * @param input				The input string
	 * @param currentCharNdx		The location where an error was found
	 * @return					Two lines, the entire input line followed by a line with an up arrow
	 */
	private static String displayInput(String input, int currentCharNdx) {
		// Display the entire input line
		String result = input + "\n";
		
		// Display a line with enough spaces so the up arrow point to the point of an error
		for (int ndx=0; ndx < currentCharNdx-1; ndx++) result += " ";
		
		// Add the up arrow to the end of the second line
		return result + "^";
	}
	
	/**********
	 * This private method indicates if a state is final for the purposes of writing out the trace
	 * 
	 * @param state		The state number whose final state is being questioned
	 * @return			True if it is a final state, otherwise, false 
	 */
	private static boolean isFinalState(int state) {
		switch (state) {
		case 0: return false;
		case 1: return false;
		case 2: return false;
		case 3: return false;
		case 4: return true;
		case 5: return false;
		case 6: return false;
		case 7: return true;
		case 8: return false;
		case 9: return false;
		}
		return false;
	}
	
	/**********
	 * This method is a mechanical transformation of a Finite State Machine diagram into a Java
	 * method.
	 * 
	 * @param input		The input string for the Finite State Machine
	 * @return			An output string that is empty if every things is okay or it will be
	 * 						a string with a help description of the error follow by two lines
	 * 						that shows the input line follow by a line with an up arrow at the
	 *						point where the error was found.
	 */
	private static String executeFSM(String input) {
		// The following are the local variable used to perform the Finite State Machine simulation
		int state = 0;						// This is the FSM state number
		boolean running = true;				// This controls whether or not the loop continues 
		int currentCharNdx = 0;				// The index of the current character
		char currentChar = input.charAt(0);	// The current character from the above indexed position
		
		// The Finite State Machines continues until the end of the input is reached or at some 
		// state the current character does not match any valid transition to a next state
		while (running) {
			
			// Display the information about this step in the execution in the execution trace

			System.out.print(((state < 10) ? "  " : " ") + state + 
				((isFinalState(state)) ? "       F   " : "           "));

			// The switch statement takes the execution to the code for the current state, where
			// that code sees whether or not the current character is valid to transition to a
			// next state
			switch (state) {
			case 0: 
				// State 0 has three valid transitions.  Each is addressed by an if statement.
				
				// If the current character is in the range from 1 to 9, it transitions to state 1
				if (currentChar >= '0' && currentChar <= '9') {
					state = 1;
					break;
				}
				// If the current character is a decimal point, it transitions to state 2
				else if (currentChar == '.') {
					state = 2;
					break;					
				}
				
				
				// If it is none of those characters, the FSM halts
				else 
					running = false;
				
				// The execution of this state is finished
				break;
			
			case 1: 
                // State 0 has three valid transitions.  Each is addressed by an if statement.
				
				// If the current character is in the range from 1 to 9, it transitions to state 1
				if (currentChar >= '0' && currentChar <= '9') {
					state = 1;
					break;
				}
				// If the current character is a decimal point, it transitions to state 3
				else if (currentChar == '.') {
					state = 3;
					break;					
				}
				
				
				// If it is none of those characters, the FSM halts
				else 
					running = false;
				break;
			
			case 2: 
                // State 2 has three valid transitions.  Each is addressed by an if statement.
				
				// If the current character is in the range from 1 to 9, it transitions to state 1
				if (currentChar >= '0' && currentChar <= '9') {
					state = 4;
					break;
				}
				
				
				// If it is none of those characters, the FSM halts
				else 
					running = false;
				break;
			
			case 3:
                // State 0 has three valid transitions.  Each is addressed by an if statement.
				
				// If the current character is in the range from 1 to 9, it transitions to state 1
				if (currentChar >= '0' && currentChar <= '9') {
					state = 4;
					break;
				}
				
				
				
				// If it is none of those characters, the FSM halts
				else 
					running = false;
				break;
			
			case 4: 
                // State 0 has three valid transitions.  Each is addressed by an if statement.
				
				// If the current character is in the range from 1 to 9, it transitions to state 1
				if (currentChar >= '0' && currentChar <= '9') {
					state = 4;
					break;
				}
				// If the current character is a decimal point, it transitions to state 2
				else if (currentChar == 'e') {
					state = 5;
					break;					
				}
				
				
				// If it is none of those characters, the FSM halts
				else 
					running = false;
				break;
			
			case 5: 
				// State 5 has two valid transitions. It is address by the following if statements.
				
				// If the current character is in the range from 0 through 9, it accepts that 
				// character and transition to state 7		
				if (currentChar >= '0' && currentChar <= '9') {
					state = 7;
					break;
				}
				
				// If the current character is a plus or a minus, it accepts that character and
				// transitions to state 6
				else if (currentChar == '+' || currentChar == '-') {
					state = 6;
					break;
				}
				// If it is none of those characters, the FSM halts
				else
					running = false;
				
				// The execution of this state is finished
				break;
			
			case 6: 
				// State 6 has one valid transition. It is address by the following if statement.
				
				// If the current character is in the range from 0 through 9, it accepts that 
				// character and transition to state 7		
				if (currentChar >= '0' && currentChar <= '9') {
					state = 7;
					break;
				}
				// If it is none of those characters, the FSM halts
				else
					running = false;
				
				// The execution of this state is finished
				break;
		
			case 7: 
				// State 7 has one valid transition. It is address by the following if statement.
				
				// If the current character is in the range from 0 through 9, it accepts that 
				// character and it stays in state 7		
				if (currentChar >= '0' && currentChar <= '9')
					break;
				
				// If it is none of those characters, the FSM halts
				else
					running = false;
				
				// The execution of this state is finished
				break;
			
			case 8:
				// State 8 has one valid transition. It is address by the following if statement.
				
				// If the current character is a decimal point, it accepts that character and it
				// transitions to state 9		
				if (currentChar == '.') {
					state = 9;
					break;
				}
				// If it is not that character, the FSM halts
				else
					running = false;
				
				// The execution of this state is finished
				break;
			
			case 9: 
				// State 9 has two valid transitions. It is address by the following if statements.
				
				// If the current character is in the range from 1 through 9, it accepts that 
				// character and transition to state 4		
				if (currentChar >= '1' && currentChar <= '9') {
					state = 4;
					break;
				}
				// if the current character is a zero, it accepts that character and stays in that
				// state
				else if (currentChar == '0') 
					break;
				
				// If it is not that character, the FSM halts
				else
					running = false;
				
				// The execution of this state is finished
				break;

			}
			
			// Display the rest of the FSM trace line
			if (running)
				System.out.println("  " + currentChar + " " + 
						((state < 10) && (state != -1) ? "    " : "   ") + state );
			else
				if (currentCharNdx <= input.length())
					System.out.println("  " + currentChar);
				else
					System.out.println("None");

			// When the processing of a state has finished, the FSM proceeds to the next character
			// in the input and if there is one, it fetches that character and updates the 
			// currentChar.  If there is no next character the currentChar is set to a blank.
			currentCharNdx++;
			if (currentCharNdx < input.length())
				currentChar = input.charAt(currentCharNdx);
			else
				currentChar = ' ';
			
			// Should the FSM get here, the loop starts again
		}
				
		// When the FSM halts, we must determine if the situation is an error or not.  That depends
		// of the current state of the FSM and whether or not the whole string has been consumed.
		// This switch directs the execution to separate code for each of the FSM states.
		switch (state) {
		case 0:
			// State 0 is not a final state, so we can return a very specific error message
			return "The first character must be a digit or a decimal point.";
		case 1:
			//State 1 is not a final state, so we can return a very specific error message
			return "Please enter a valid input string with a proper floating point number";

		case 2:
			// This is a stub that must be filled in
			return "Please enter a number after the decimal point.";

		case 3:
			// State 3 is not a final state, so we can return a very specific error message
			return "Please enter a number after the decimal point.";

		case 4:
			// State 4 is a final state, so we can return a specific success message.
			if (currentCharNdx<=input.length())
				return "This character may only be a digit\n" + displayInput(input, currentCharNdx);
			else 
				return "";
		case 5:
			// State 5 is not a final state.  In order to move forward, the next character must be
			// a digit or a plus or a minus character.
			return "This character may only be a digit or a plus or minus character.\n" + 
				displayInput(input, currentCharNdx);
			
		case 6:
			// States 3, 6, and 9 are the same. None of them are final states and in order to
			// move forward, the next character must be a digit.
			return "This character may only be a digit\n" + displayInput(input, currentCharNdx);

		case 7:
			// States 7 is similar to states 3, 6, and 9, but it is a final state, so it must be
			// processed differently. If the next character is not a digit, the FSM stops with an
			// error.  We must see here if there are no more characters. If there are no more
			// characters, we accept the input, otherwise we return an error
			if (currentCharNdx<=input.length())
				return "This character may only be a digit\n" + displayInput(input, currentCharNdx);
			else
				return "";			
			
		case 8:
			// State 8 is not a final state.  In order to move forward, the next character must be
			// a decimal point.
			return "This character may only be a decimal point\n" + 
				displayInput(input, currentCharNdx);	
			
		case 9:
			// States 3, 6, 7, and 9 are the same. None of them are final states and in order to
			// move forward, the next character must be a digit.
			return "This character may only be a digit\n" + displayInput(input, currentCharNdx);
		}
		
		// This statement is not needed because all possible paths above contain a return.  Since 
		// the Java compiler can't know that, we must put a statement here to ensure that a valid
		// value is returned.
		return "";
	}
	
	/**********
	 * This method roots the execution of the Finite State Machine System.  The Finite State
	 * Machine is defined by the hand coded method called executeFSM, which is passed the input
	 * string from the user and returns either an empty string signaling the input was accepted
	 * or a non-empty string with a helpful error message and in most cases a copy of the input
	 * with a following line pointing at where the error was found. 
	 * 
	 * As long as the user keeps providing non-empty input lines, the executeFSM will simulate 
	 * the FSM, showing a state traces of it's execution, then will then return the empty error
	 * message if all is well, or an actual error message if it is not.
	 * 
	 * This main method welcomes the user, reads input from the user, and if the input is not 
	 * empty it calls the executeFSM as listed above. Should the user enter an empty input line,
	 * the controlling loop will stop and an end of execution message is displayed.
	 * 
	 * @param args	The program args are ignored/.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Finite State Machine System\n");

		// Associate the system keyboard with a Scanner object
		Scanner keyboard = new Scanner(System.in);

		// Initialize the inputLine local variable.
		String inputLine = "";

		// Request input from the user and then read in what the user enters
		System.out.println("Enter a string to see if it is recognized by the FMS.  Enter an empty "
				+ "line to terminate.");

		// As long as there is a next line, read it in... Since the input is the keyboard, this is 
		// always true
		while (keyboard.hasNextLine()) {
			inputLine = keyboard.nextLine().trim();		// Fetch the next line. If the length of 
			if (inputLine.length() == 0) {				// the trimmed line is zero, stop the loop
				System.out.println("\n*** Empty input line detected, the loop stops.");
				keyboard.close();						// Display the reason for terminating the
				break;									// loop.
			}
			
			// Display the title for the execution trace
			System.out.println("\nCurrent Final Input  Next\nState   State Char  State");

			// Execute the Finite State Machine and capture the result
			String errorMessage = executeFSM(inputLine);
			
			// If the result is empty, the FSM recognized the input, other wise it contains an
			// error message
			if (errorMessage.length() == 0)
				System.out.println("\nThe input <" + inputLine + "> was recognized without error");
			else
				System.out.println("\n*** Error *** " + errorMessage + "\n");
		}
		// Once an empty input line is given to the application, the loop ends and so we close the 
		// keyboard and allow the application to quit. The console should always have a next line, 
		// so the following code will never be performed, but the compiler does not know this, so
		// we put the following there to avoid a warning message.
		keyboard.close();
	}
}
