package searchExamples;

import java.util.Arrays;

public class IterativeSearchN {
	private static String[] elements = {"Sanchit","Akshay","Dolly","Pratik","Puneet","Vinit",};
	
	public static int iterativeSearch (String[] elements2, String goal) {
		
		Arrays.sort(elements);
		int ndx = 0;
		while (ndx< elements.length && elements[ndx]!=(goal)) ndx++;
		if (ndx >= elements.length) return -1;
		if (goal.matches(elements[ndx])) return ndx;
		else return -1;
	}

	public static void main(String[] args) {
		String goal = "Sanchit";
		int result = iterativeSearch(elements,goal);
		if (result<0)
			System.out.println("The goal could not find:" +""+ goal);
		else
			System.out.println("The goal of" + " "+goal +" "+ "was found at index:" + result);
	}

	}
