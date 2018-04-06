
import java.util.Scanner;
public class Palindrome{
    
	public static boolean isPal(String s)
    {   
    
		if(s.length() == 0 || s.length() == 1)
            return true; 
    
		if(s.charAt(0) == s.charAt(s.length()-1))
        
			return isPal(s.substring(1, s.length()-1));
        
		return false;
    }
    
	public static void main(String[]args)
    {
    
		long start = System.nanoTime();
    	
		long stop = System.nanoTime();
        
		Scanner s = new Scanner(System.in);
        
		System.out.println("Enter string:-");
        String string = s.nextLine();
       
        if(isPal(string))
            System.out.println(string + "\nis a palindrome");
        
        else
            System.out.println(string + " is not a palindrome");
        
        long duration = stop - start;
	    
        System.out.println("\nIt took " + duration/1000000 + " milliseconds to compute this last value.");
    }
}
