package hello;

// An array is a variable that can store many values in it. Arrays can only store data of the same data type.

public class apples {
	public static void main(String[] args) {
	
		// first way to create an array
		int bucky[] = new int[10]; // create array of 10 elements, elements start from 0 to 9
		
		bucky[0] = 87;
		bucky[1] = 543;
		bucky[0] = 65;
		System.out.println(bucky[1]); // prints 543
		
		// second way to create an array: array initializer list
		int bucky1[] = {2,4,5,7,9}; // list of the elements
		System.out.println(bucky1[2]); // prints 5
		
		
		// passing array into functions
		int bucky2[] = {3,4,5,6,7};
		change(bucky2);
		
		for(int y: bucky2)
			System.out.println(y); // prints 8, 9 , 10 , 11 ,12 
		System.out.println();
		
		// create multi-dimensional arrays and print them in a table
		
		int firstarray[][] = {{8,9,10,11},{12,13,14,15}};
       	        int secondarray[][] = {{30,31,32,33},{43},{4,5,6}}; 
        
        	System.out.println("This is the first array");
        	display(firstarray);
        
       		System.out.println("This is the second array");
       		display(secondarray);
		
        	//This is the first array
        	// 8  9	 10	11	
        	// 12 13 14	15	
        
        	// This is the second array
        	// 30   31	32	33	
        	// 43	
        	// 4	5	6	
			
		}
	
		public static void change(int x[]) {  // function that adds 5 to each element of the array
		for(int counter = 0; counter < x.length; counter++) {
			x[counter]+=5;
			}
		}
		
		 public static void display (int x [][]){ // function used for creating a table of elements
		        for(int row=0;row <x.length;row++){
		            for(int column=0;column < x[row].length;column++){
		                System.out.print(x[row][column]+"\t");
		            }
		System.out.println();
		        }
		
	
	}
}
