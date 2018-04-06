
import java.io.*;
import java.util.Scanner;
 
public class ElementSum
{
 
public static void main(String[] args)
{
System.out.println("Enter the value of N");
 
Scanner sc = new Scanner(System.in); 
int number = sc.nextInt(); 
 
int sum = sumR(number);
 
System.out.println("Sum of " + number + " Numbers using Recursion is : " + sum);
}
 

public static int sumR(int num)
{
int sum;
if(num==1) return(1) ;
 
else sum=num + sumR(num-1); 
return sum;
 
}
 
}
