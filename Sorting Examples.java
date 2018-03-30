
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Details  {

	public static void main(String args[]){

List<Double> testList=new ArrayList();
		testList.add(0.5);
		testList.add(0.2);
		testList.add(0.9);
		testList.add(0.1);
		testList.add(0.1);
		testList.add(0.1);
		testList.add(0.54);
		testList.add(0.71);
		testList.add(0.71);
		testList.add(0.71);
		testList.add(0.92);
		testList.add(0.12);
		testList.add(0.65);
		testList.add(0.34);
		testList.add(0.62);

			   /* Sort statement*/
		   Collections.sort(testList);

		   /* Sorted List*/
		   System.out.println("1) After Sorting the list by collections.sort method:");
		  System.out.println("\n ==>" +""+testList);
		  
		   /* reverse statement*/
		   Collections.reverse(testList);

		   /* Sorted List*/
		   System.out.println("\n2) After Sorting the list by collections.reverse method:");
		  System.out.println("\n ==>" +""+testList);
		  
List<String> testString = new ArrayList();
		  testString.add("S");
          testString.add("a");
          testString.add("n");
          testString.add("c");
          testString.add("h");
          testString.add("i");
          testString.add("t");
          
          /*sort statement for string */
          testString.sort(null);
          
          /* Sorted List*/
          System.out.println("\n3) After sorting the lsit by string method");
          System.out.println("\n ==>" +""+ testString);
          
          
List <Float> testFloat = new ArrayList();
          testFloat.add(0.00F);
          testFloat.add(1.006F);
          testFloat.add(7.5F);
          testFloat.add(0.4F);
          testFloat.add(0.53F);
          testFloat.add(5.50F);
          testFloat.add(4.015F);

          /*sort statement for Float */
          testFloat.sort(null); 
          
          /* Sorted List*/
          System.out.println("\n4) After sorting the list by float method");
          System.out.println("\n ==>" +""+ testFloat);
       }
}
