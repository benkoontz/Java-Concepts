package halo;

import java.util.*;

// A generic method is a way you can eliminate overloaded methods. 
// This works by allowing the method to accept different types of data.

public class apples {
	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b', 'u', 'c', 'y'};
		
		printMe(iray);
		printMe(cray);
	}
	
	
	
	// generic method
	public static <T> void printMe(T[] x) {
		for(T b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
}
