package halo;

import javax.swing.JFrame;

// When the user clicks the regular button, a regular button window shows up. 
// When the user hovers over the custom button and clicks the window, a custom button window shows up.

public class apples {
	public static void main(String[] args) {
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200); // window size
		go.setVisible(true);
		
	}

}
