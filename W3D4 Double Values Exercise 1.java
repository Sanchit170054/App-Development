package doubleValues;

public class Exercise1ExploreDoubleValues {
	
	public static void main(String args[]) {
		
		/**********************************************************************************************
		 * Explore 1.0	
		 */
		// This is the starting double value
		double doubleInput = 1.0;

		// Convert the starting value to the equivalent value in a long
		long doubleAsLong = Double.doubleToRawLongBits( doubleInput );

		// Convert the long to a String
		String doubleAsString = Long.toHexString( doubleAsLong );

		// Print the String
		System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );


		/**********************************************************************************************
		 * Explore 0.5	
		 */
		// This is the starting double value
		doubleInput = 0.5;

		// Convert the starting value to the equivalent value in a long
		doubleAsLong = Double.doubleToRawLongBits( doubleInput );

		// Convert the long to a String
		doubleAsString = Long.toHexString( doubleAsLong );

		// Print the String
		System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );


		/**********************************************************************************************
		 * Explore 10.0	
		 */
		// This is the starting double value
		doubleInput = 10.0;

		// Convert the starting value to the equivalent value in a long
		doubleAsLong = Double.doubleToRawLongBits( doubleInput );

		// Convert the long to a String
		doubleAsString = Long.toHexString( doubleAsLong );

		// Print the String
		System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );


		/**********************************************************************************************
		 * Explore -10.0	
		 */
		// This is the starting double value
		doubleInput = -10.0;

		// Convert the starting value to the equivalent value in a long
		doubleAsLong = Double.doubleToRawLongBits( doubleInput );

		// Convert the long to a String
		doubleAsString = Long.toHexString( doubleAsLong );

		// Print the String
		System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );


		/**********************************************************************************************
		 * Explore 0.1	
		 */
		// This is the starting double value
		doubleInput = 0.1;

		// Convert the starting value to the equivalent value in a long
		doubleAsLong = Double.doubleToRawLongBits( doubleInput );

		// Convert the long to a String
		doubleAsString = Long.toHexString( doubleAsLong );

		// Print the String
		System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );

		
		// This is the starting double value
				doubleInput = 7.0;

				// Convert the starting value to the equivalent value in a long
				doubleAsLong = Double.doubleToRawLongBits( doubleInput );

				// Convert the long to a String
				doubleAsString = Long.toHexString( doubleAsLong );

				// Print the String
				System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );
				
				
				// This is the starting double value
				doubleInput = 14.0;

				// Convert the starting value to the equivalent value in a long
				doubleAsLong = Double.doubleToRawLongBits( doubleInput );

				// Convert the long to a String
				doubleAsString = Long.toHexString( doubleAsLong );

				// Print the String
				System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );
		
				
				
				// This is the starting double value
				doubleInput = 0.1;

				// Convert the starting value to the equivalent value in a long
				doubleAsLong = Double.doubleToRawLongBits( doubleInput );

				// Convert the long to a String
				doubleAsString = Long.toHexString( doubleAsLong );

				// Print the String
				System.out.println(doubleInput + " as hexadecimal: " + doubleAsString );
		
	}

}
