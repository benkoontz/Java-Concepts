package halo;

import java.util.*;

// Encapsulation is when the variables of a class are hidden and can only be accessed by another class,
//  through the use of methods. Variables are declared as private and methods are declared as public.

public class Ben {
	public static void main(String[] args) {
		
		 Encapsulate obj = new Encapsulate(); 
         
	        // setting values of the variables  
	        obj.setName("Ben"); 
	        obj.setAge(24); 
	        obj.setID(51); 
	          
	        // Displaying values of the variables 
	        System.out.println("name: " + obj.getName()); 
	        System.out.println("age: " + obj.getAge()); 
	        System.out.println("id: " + obj.getID()); 
	          
	              
	    } 
}
