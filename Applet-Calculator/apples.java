package halo;

import java.awt.*;
import javax.swing.*;

// An applet is a way in using a java program through your iternet browser

public class apples extends JApplet { // any time your browser opens an Applet, Japplet has the methods
	
	private double sum;
	
	public void init() {	// init is short for initialization
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		double n1 = Double.parseDouble(fn); // converts string to double
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("the sum is " + sum, 25, 30);
	
	}
	
}
