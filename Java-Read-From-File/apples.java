package halo;

import java.io.File; // class that gives info about files
import java.util.*;


// program that creates files

public class apples {
	public static void main(String[] args) {
	
		readfile r = new readfile();
		r.openFile();
		r.readFile();
		r.closeFile();
	
	}
}
