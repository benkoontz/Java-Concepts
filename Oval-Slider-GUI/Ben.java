package halo;

import javax.swing.JFrame;

public class Ben {
	public static void main(String[] args) {
		Window w = new Window();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you dont do this the program wont close when you click x
		w.setSize(230,280);
		w.setVisible(true);
	}

}
