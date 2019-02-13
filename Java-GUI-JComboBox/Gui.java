package halo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// JComboBox program


public class Gui  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename = {"b.jpg", "x.jpg"}; // array of file names
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
	
	public Gui() {
		super("the title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener() {	// anonymous class that implements item listener
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange() == ItemEvent.SELECTED) // what was selected
							picture.setIcon(pics[box.getSelectedIndex()]);
					}
					
				}
				
				);
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
	}
	

	
}
