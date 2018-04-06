
public class Factor {

    static int num=0;
	
	public static void main(String[] args) {	
	System.out.println("Number of factors of 2 are:  " + factorOf2(1000));
		
	}

	private static int factorOf2 (int number) {
		
		
		if(number %2 == 1) return num;
				
		
		if (number % 2 == 0) 	
			++num;             
			return factorOf2(number/2);
			
				
	}
}
