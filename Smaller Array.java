
public class SmallerArray {

	static int min;
	
	public static void main(String[] args) {
		int container[] = {-3,70,14,4,-1,-9,87,-2,6,};	
		
		
		System.out.println("Smallest is: = " + small(container, container.length));
		
	}

	private static int small(int numbers[], int size) {
			
			if(size-1<=0) return min;
			
			if (numbers[size-1] < min)   
				min = numbers[size-1];   
		
		return small(numbers, --size);
		
	}
}
