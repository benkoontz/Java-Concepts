package halo;

import java.awt.*;
import javax.swing.*;

// Drawning an oval with slider

public class apples extends JPanel {
	
	private int d = 10;
	
	public void paintComponent(Graphics g) { // way of painting circle on screen
		super.paintComponent(g);
		g.fillOval(10, 10, d, d);
	}
	
	public void setD(int newD) {
		d = (newD >= 0 ? newD : 10); // check if number for diameter is greater than 0
		repaint(); // calls paint component method from the same class
	}
	
	public Dimension getPreferredSize() {	// used by layout manager to determine best size
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
	
}
