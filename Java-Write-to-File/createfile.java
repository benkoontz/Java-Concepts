package halo;

import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("ben.txt"); // create file
		}
		catch(Exception e) {
			System.out.println("you have an error");
		}
	}

	public void addRecord() {
		x.format("%s%s%s", "20 ", "bucky ", "roberts ");
	}
	
	public void closeFile() {
		x.close();
	}
}
