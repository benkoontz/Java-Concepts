package halo;

import java.awt.*;	// colors, border layouts, etc
import java.awt.event.*; // mouse events
import javax.swing.*; 
import javax.swing.event.*;

// Adapter class program. An adapter class implements an interface that overrides a blank body.
// You only have to overried methods you want to use


public class Gui  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	private String details;
	private JLabel statusbar;
	
	public Gui() {
		super("title");
	
	
	statusbar = new JLabel("this is default");
	add(statusbar, BorderLayout.SOUTH);
	addMouseListener(new MouseClass());
	
	}
	
	private class MouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			details = String.format("you clicked %d", event.getClickCount());
			
			if(event.isMetaDown())	// right mouse button
				details += "with right mouse button";
			else if(event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		}
	}
	
	
}
