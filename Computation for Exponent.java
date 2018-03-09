import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputationForExponent {
	public static boolean abc(double c) {
		if (c==1) {
			boolean answer = true;
			return answer;
		}
		if (c==2) {
			boolean answer = true;
			return answer;
		}
		if (c==3) {
			boolean answer = true;
			return answer;
		}
		else {
			boolean answer = false;
			return answer;
		}
		

}
	public static String exponentiation(double n, double measuredValue, double errorTerm) {
		if (abc(n)==true) {
		double errorFactor = errorTerm / measuredValue;
		double a = Math.pow(measuredValue, n);
		double powET = Math.abs(a * errorFactor);
		DecimalFormat b = new DecimalFormat("####.##");
		String rounded = b.format(powET);
		String rounded1 = b.format(a);
		String result = rounded1 +" \u00B1 " + rounded;
		return result;
		}
		else return "Only 1, 2 and 3 can be recognized";
	}

public static void main(String[] args) {		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value 1");
		double value1 = value.nextDouble();
		
		System.out.println("Enter error term 1");
		double errorTerm1 = value.nextDouble();
			
		System.out.println("Enter 1 for squareroot, 2 for square and 3 for cube");

		double c = value.nextDouble();
		String result =exponentiation(c, value1, errorTerm1);	
				System.out.println(result);
			
	value.close();
	}
}

