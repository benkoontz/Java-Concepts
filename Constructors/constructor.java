package halo;
import java.io.*;

public class constructor {
	
	int tuna;
	String fish;
	
	// no argument constructor
	constructor() {
		System.out.println("i am a regular constructor");
	}
	
	// parameterized constructor
	constructor(int tuna, String fish) {
		this.tuna = tuna;
		this.fish = fish;
	}
	
	// 3 overloaded constructors
	constructor(String name) {
		System.out.println("constructor with one string argument: " + name);
	}
	
	constructor(String name, int age) {
		System.out.println("constructor with one string argument and one int argument: " + name + age);
	}
	
	constructor(long id) {
		System.out.println("constructor with one long argument" + id);
	}

}
