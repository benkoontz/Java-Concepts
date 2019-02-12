package halo;

import java.util.*;

// A singleton class is a class that can only have one object at a time
// first make a constructor private
// then write a static method that has a return type of that object

class Ben
{ 
    public static void main(String args[]) 
    { 

        Singleton x = Singleton.getInstance(); 
        Singleton y = Singleton.getInstance(); 
        Singleton z = Singleton.getInstance(); 
  
        y.s = (x.s).toUpperCase(); // changing string to  uppercase
        
        // these all print uppercase because when you change one object, it changes all objects
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        z.s = (z.s).toLowerCase();  // changing string to lowercase
  
        // these all print lower case because when you change one object, it changes all objects
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
    } 
} 
