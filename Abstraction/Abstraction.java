
package halo;

import java.util.*;


abstract class abstractClass{
	   /* These two are abstract methods, the child class
	    * must implement these methods
	    */
	   public abstract int sumOfTwo(int n1, int n2);
	   public abstract int sumOfThree(int n1, int n2, int n3);
		
	   //Regular (or Concrete) method , this method doesn't have to be overridden
	   public void disp(){ // all methods in an abstract class don't have to be abstract
		System.out.println("Method of class Sum");
	   }
	}
