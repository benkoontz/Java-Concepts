package halo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// JCheckBox program


public class Gui  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public Gui() {
		super("the title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("this is a sentence", 20); // size of 20
		tf.setFont(new Font("Serif", Font.PLAIN, 14)); // how to set the font
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");
		add(boldbox);
		add(italicbox);
		
		HandlerClass handler = new HandlerClass();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
	}
	
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null; // store the font that is changed
			
			// change text according to what user selects
			if(boldbox.isSelected() && italicbox.isSelected()) 
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if (boldbox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if (italicbox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			tf.setFont(font);
			
		}
		
	}
}
