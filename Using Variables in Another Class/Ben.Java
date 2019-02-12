package halo;

import java.util.*;

// Calling variables in one class to use in another class

class Ben extends constructor
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    { 
    	
       Objects obj = new Objects();
       
       // these variables are given values in the other class
       int animal = obj.moose; // moose is a public int equal to 0
     //int animal2 = obj.moose1; // moose1 is a private int equal to 1, this won't work since it's private
       int animal3 = obj.moose2; // moose2 is a protected int equal to 2
       
       System.out.println(animal);
       //System.out.println(animal2);
       System.out.println(animal3);
      
       ///////////////////////////////////////////////////////////////////////////////////
       
       // these variables aren't given values in the other class
      int day = obj.year;
     // int day1 = obj.year1;
      int day2 = obj.year2;
      
      // these both equal 0 because they aren't given any values
      System.out.println("day is " + day); 
      System.out.println("day is " + day2);
       
       
    } 
} 
