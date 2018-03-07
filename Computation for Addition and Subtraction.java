import java.util.Scanner;
public class Computation {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter the first Measured Value: - ");
				double MeasuredValue1 = keyboard.nextDouble();
				System.out.println("Error the first Error Term: - ");
				double ErrorTerm1 = keyboard.nextDouble();
				
				System.out.println("Enter the second Measured Value: - ");
				double MeasuredValue2 = keyboard.nextDouble();
				System.out.println("Error the second Error Term: - ");
				double ErrorTerm2 = keyboard.nextDouble();
			
				System.out.println("Enter Add or Sub for the computation");
				String a = keyboard.next();
								
				if(a.equals("Add")) {
				double result1 = MeasuredValue1 + MeasuredValue2;
				double resultError = ErrorTerm1 + ErrorTerm2;
				
			System.out.println("Addition: - " + result1 +  " ± " + resultError );
				}
				
				System.out.println("Enter Add or Sub for the computation");
				String b = keyboard.next();
				
				if(b.equals("Sub")) {	
				double result2 = MeasuredValue1 - MeasuredValue2;
				double resultError2 = ErrorTerm1 + ErrorTerm2;

			System.out.println("Subtraction: -" + result2  + " ± "  + resultError2 );
				}

		     }
		}




