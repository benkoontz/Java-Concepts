package halo;

import java.io.File; // class that gives info about files
import java.util.*;


// program that creates files

public class apples {
	public static void main(String[] args) {
	
		createfile g = new createfile();
		g.openFile();
		g.addRecord();
		g.closeFile();
	
	}
}
