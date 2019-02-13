package hello;

// An event is anything the user can do. For example clicking a box.
// An event handler is the code that responds to what the user can do. 

import java.awt.FlowLayout; // gives the layout
import java.awt.event.ActionListener; // waits for the user to do something
import java.awt.event.ActionEvent; //  events that can happen
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JFrame; //  gives the basic window
import javax.swing.JLabel; // allows to output text and images on the screen


public class tuna  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public tuna() {
		super("The title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here") ;
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		// action listener object
		
		thehandler handler = new thehandler(); // builds an action listener object
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener {	
		
		public void actionPerformed(java.awt.event.ActionEvent event) {
			
			String string = "";
			
			if(event.getSource() == item1) {
				string = String.format("field 1: %s", event.getActionCommand()); // get action command means get the text from that location
			} else if (event.getSource() == item2) {
				string = String.format("field 2: %s", event.getActionCommand()); 
			} else if (event.getSource() == item3) {
				string = String.format("field 3: %s", event.getActionCommand()); 
			}
			  else if (event.getSource() == passwordField) {
						string = String.format("password field is: %s", event.getActionCommand());  
			  }
			
			JOptionPane.showMessageDialog(null, string);
			
		}
	}
	
	
	
	
	
	

}
