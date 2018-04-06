package RecurionPuzzlesTemplets;
import java.util.*;
public class Sum
{
    public int sumofelement
    (int n)
    {
        if(n==0)
            return 0;
        else
            return n+sumNumbers(n-1);
    }


    public static void main(String args[])
    {
        Scanner o =new Scanner(System.in);
        System.out.println("Enter value");
        int n=o.nextInt();
        Sum obj=new Sum();
        int sum=obj.sumNumbers(n);
        System.out.println("The sum of numbers is "+sum);
    }
}
