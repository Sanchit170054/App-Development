package doubleValues;

public class Exercise2ConvertHexadecimalToDouble {

	/*****
	 * Convert a string representation in hexadecimal to a double.  If the String has less that 16
	 * characters, it treats the upper characters as if they were zeros.  If it has more than 16
	 * characters, it discards the leading characters an uses just the last (right most) 16 hex digits.
	 * 
	 * @param text   The input parameter is a String of hexadecimal characters
	 * 
	 * @return       An equivalent double value is returned
	 */
	public static long parseUnsignedHex(String text) {
		if (text.length() == 16)
			return (Long.parseLong(text.substring(0, 1), 16) << 60) | 
					Long.parseLong(text.substring(1), 16);
		else if (text.length() < 16)
			return Long.parseLong(text, 16);
		else
			return (Long.parseLong(text.substring(text.length()-16, text.length()-15), 16) << 60) |              
					Long.parseLong(text.substring(text.length()-15), 16);
	}

	public static void main (String [] args) {
		
		// Check to see if a hexadecimal value of 64 bits is an expected double value
		
		// Set the following variable to a double value that you believe the bits should produce
		double inputValue = 1.0;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		String hexadecimalValue = "3FF0000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		double resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
		
		// Check to see if a hexadecimal value of 64 bits is an expected double value
		
		// Set the following variable to a double value that you believe the bits should produce
		inputValue = 1.25;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "3FF4000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
		
		// Check to see if a hexadecimal value of 64 bits is an expected double value
		
		// Set the following variable to a double value that you believe the bits should produce
		inputValue = 2.5;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "4004000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);

		
		
		// Check to see if a hexadecimal value of 64 bits is an expected double value
		
		// Set the following variable to a double value that you believe the bits should produce
		inputValue = 5.0;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "4014000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
		
		// Check to see if a hexadecimal value of 64 bits is an expected double value
		
		// Set the following variable to a double value that you believe the bits should produce
		inputValue = -5.0;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "C014000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
		
		// Set the following variable to a double value that you believe the bits should produce
		inputValue = 0.1;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "3FB999999999999A";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
	inputValue = 7.0;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "401c000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
inputValue = 14.0;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "402c000000000000";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
inputValue = 0.1;
		
		// Set the following variable to a string of 16 hexadecimal value you believe is the same as the double value
		hexadecimalValue = "3fb999999999999a";
		
		// Convert the hexadecimal string value into an actual double value
		resultValue = Double.longBitsToDouble(parseUnsignedHex(hexadecimalValue));
		
		// Display what you believe the value to be and what it actually is
		System.out.println("We expect " + hexadecimalValue + " should be: " + inputValue + 
				" and what it really is: " + resultValue);
		
		
	}

}
