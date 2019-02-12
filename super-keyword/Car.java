package halo;

import java.util.*;

public class Car extends Vehicle{
	
	int maxSpeed = 180;
	
	Car() { 
		super(); // using Vehicle constructor
		System.out.println("car constructor"); // using car constructor
	}
	
	void message() { // regular method
		System.out.println("ben in the car class");
	}
	
	void display() {
		System.out.println("maximum speed " + super.maxSpeed); // calls maxSpeed in Vehicle
		super.message(); // using super for a method from Vehicle class
		message(); // uses message method in Car class
		
	}
	
	
	
	
	

}
