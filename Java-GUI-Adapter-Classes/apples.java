package halo;

import javax.swing.JFrame;

// The user clicks in the window with either the left mouse button, 
// right mouse button, or center mouse button. Text appears on the screen to show which mouse button was clicked.

public class apples {
	public static void main(String[] args) {
	
	Gui bucky = new Gui();
	bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bucky.setSize(300, 200);
	bucky.setVisible(true);
	
	}
}
