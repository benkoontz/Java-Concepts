package hello;

import java.awt.FlowLayout; // gives the default layout managing
import javax.swing.JFrame; //  gives the basic window
import javax.swing.JLabel; // allows to output text and images on the screen


public class tuna  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JLabel item1;
	
	public tuna() {
		super("The title bar"); // how to add title to window
		setLayout(new FlowLayout()); //  give the defualt layout
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("This is gonna show up on hover"); // text that shows up on hover
		add(item1); // add item to window
	}
	
	
	

}
