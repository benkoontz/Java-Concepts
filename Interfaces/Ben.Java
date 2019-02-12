package halo;

import java.util.*;

// an interface is a class that only contains abstract methods
// all the abstract methods in the interface class need to be overwritten if used in a regular class


class Ben implements InterfaceClass{ // implements is used for using an interface
	   public int multiplyTwo(int num1, int num2){
	      return num1*num2;
	   }
	   public int multiplyThree(int num1, int num2, int num3){
	      return num1*num2*num3;
	   }
	   public static void main(String args[]){
	      InterfaceClass obj = new Ben();
	      System.out.println(obj.multiplyTwo(3, 7));
	      System.out.println(obj.multiplyThree(1, 9, 0));
	   }
	}
