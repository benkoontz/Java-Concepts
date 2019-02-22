package halo;

import java.util.*;

// Primitive data types and Wrapper class
// Primitive data types just store values, 
// Wrapper classes have their own methods
// char is Character
// byte is Byte
// short is Short
// long is Integer
// float is Float
// double is Double
// boolean is Boolean

// int is a primitive data type
// int is used to just store data
// Integer a Wrapper class 
// Integer is a class and has it's own methods


class Ben extends Objects
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    { 
    	
        Integer a = new Integer("10"); 
        // Casting is not possible for
        // int a = (int)"123"; 
        // Casting is not possible for
        // int c="123"; 
  
        // Casting possible using methods 
        // from Integer Wrapper class 
        int b = Integer.parseInt("123"); 
        
        
        System.out.println(a + new Float("10.1")); // prints 20.1
        System.out.println(b + new Float("10.1")); // prints 133.1
       
        String binary = Integer.toBinaryString(123); 
        String octal = Integer.toOctalString(123); 
        String hexadecimal = Integer.toHexString(123); 
        System.out.println(binary + "\n" + octal + "\n" + hexadecimal);  // prints 123 value for each case
       
    } 
} 
