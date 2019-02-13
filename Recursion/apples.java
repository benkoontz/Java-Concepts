package halo;

// Recursion is a method that calls itself. 
// Recursion is useful because it can create a set of values.

public class apples {
	public static void main(String[] args) {
		
		System.out.println(fact(5));
	
	}
	
	// fact
	public static long fact(long n) {
		if(n <= 1) 
			return 1;
		else
			return n * fact(n-1);
		
	}
	
}
