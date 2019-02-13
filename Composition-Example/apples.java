package hello;

// program that shows an example of composition
// composition means to refer to objects in other classes as members

public class apples {
	public static void main(String args[]) {
		
		potpie potObject = new potpie(4,5,6);
		
		tuna tunaObject = new tuna("ben", potObject);
		System.out.println(tunaObject);
		
	}
}
	
