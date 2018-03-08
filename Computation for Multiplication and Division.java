//**
   @Author: - Sanchit
*//
	import java.util.Scanner;
	public class Computation{

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
			
					{
					System.out.println("Enter Add or Sub or Mpy or Div for the computation");
					String c = keyboard.next();
					
					{
					if (c.equals ("Add")) {
						double result1 = MeasuredValue1 + MeasuredValue2;
						double resultError1 = MeasuredValue1 + MeasuredValue2;
					    System.out.println("Addition: -"+result1+ " ± " + resultError1 );
					}

					else if(c.equals("Sub")) {
						double result2 = MeasuredValue1 - MeasuredValue2;
						double resultError2 = MeasuredValue1 + MeasuredValue2;
						System.out.println ("Subtraction: - "+ result2+ " ± " + resultError2 );
					}
					else if(c.equals("Mpy")) {
					
					    double result3 = MeasuredValue1 * MeasuredValue2;
					    double resultError3 = (ErrorTerm1 / MeasuredValue1 + ErrorTerm2 / MeasuredValue2) * (MeasuredValue1 * MeasuredValue2);
						System.out.println("Multiplication: - " + result3 +  " ± " + resultError3 );
					}
					else if(c.equals("Div")) {	
					
						double result4 = MeasuredValue1 / MeasuredValue2;
					    double resultError4 = (ErrorTerm1 / MeasuredValue1 + ErrorTerm2 / MeasuredValue2) * (MeasuredValue1 / MeasuredValue2);
					    System.out.println("Division: -" + result4  + " ± "  + resultError4 );
					}
					
				}
	                } 
		}
	}
	


