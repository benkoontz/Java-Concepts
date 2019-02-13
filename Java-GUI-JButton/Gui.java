package halo;

// JButton program
// When the user

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Gui extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public Gui() {
		super("The title"); // used for creating the title
		setLayout(new FlowLayout());
		
		reg = new JButton("reg Button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("b.jpg")); // reg button image
		Icon x = new ImageIcon(getClass().getResource("x.jpg"));
		
		custom = new JButton("Custom", b); // second parameter is the image that appears on the button
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	} // end of constructor
	
	private class HandlerClass implements ActionListener {	// implements means the ActionListener methods are inherited and overwritten
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand())); 
			
			
		}
		
	}

}
