package halo;

import java.util.*;

// Abstraction is where only essential details are displayed to the user.
// an abstract class is a class that has an abstract method in it
// an abstract method is a method with no body that needs to be overwritten in another class
// if a regular class extends an abstract class, the class must implement all of the abstract methods,
// or the class has to be declared abstract as well


class Ben extends abstractClass{ // extends is for using the abstract class

	   /* If I don't provide the implementation of these two methods, the
	    * program will throw compilation error.
	    */
	   public int sumOfTwo(int num1, int num2){
		return num1+num2;
	   }
	   public int sumOfThree(int num1, int num2, int num3){
		return num1+num2+num3;
	   }
	   public static void main(String args[]){
		abstractClass obj = new Ben();
		System.out.println(obj.sumOfTwo(3, 7));
		System.out.println(obj.sumOfThree(4, 3, 19));
		obj.disp();
	   }
	}
