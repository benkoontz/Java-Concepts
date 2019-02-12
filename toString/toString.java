package halo;

import java.util.*;

public class toString {
	
	private int month;
	private int day;
	private int year;
	
	public toString(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		
		System.out.printf("the constructor for this is %s\n", this); // this is reference to object that was just built
		
	}
	
	
	// in the printf in the constructor, this is calling toString because of the %s
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
	
	
	

}
