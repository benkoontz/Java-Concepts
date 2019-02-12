package halo;

import java.util.*;

// Association is when two classes share a relationship that's established through their objects.
// Association can be one-to-one, one-to-many, many-to-one, many-to-many.

class Ben extends constructor
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    { 
    	
       Bank bankObj = new Bank("chase");
       Employee employeeObj = new Employee("Ben");
       
       System.out.println(employeeObj.getEmployeeName() + " is an employee of " + bankObj.getName());
       
       
    } 
} 
