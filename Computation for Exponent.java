import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputationForExponent {
	public static boolean abc(double n) {
		if (n==0.5) {
			boolean answer = true;
			return answer;
		}
		if (n==2) {
			boolean answer = true;
			return answer;
		}
		if (n==3) {
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
		double x = Math.pow(measuredValue, n);
		double powET = Math.abs(x * errorFactor);
		DecimalFormat q = new DecimalFormat("####.##");
		String rounded = q.format(powET);
		String rounded1 = q.format(x);
		String result = rounded1 +" \u00B1 " + rounded;
		return result;
		}
		else return "Only 0.5, 2 and 3 can be recognized";
	}

public static void main(String[] args) {		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value 1");
		double value1 = value.nextDouble();
		
		System.out.println("Enter error term");
		double errorTerm1 = value.nextDouble();
			
		System.out.println("Enter 0.5 for squareroot, 2 for square and 3 for cube");

		double n = value.nextDouble();
		String result =exponentiation(n, value1, errorTerm1);	
				System.out.println(result);
			
	value.close();
	}
}
