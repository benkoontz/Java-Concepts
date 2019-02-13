package halo;

import java.util.*;

import javax.swing.JFrame;

// program for drawing graphics

public class apples {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p = new Peach();
		f.add(p);
		f.setSize(499,250);
		f.setVisible(true);
	
	}
}
