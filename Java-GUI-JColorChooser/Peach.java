package halo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// JColorChooser program

public class Peach extends JFrame {
	
	private JButton b;
	private Color color;
	private JPanel panel;
	
	public Peach() {
		super("the title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("choose a color");
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "pick your color", color); // positioning, title, value
						if(color == null)
							color = (Color.WHITE);
						panel.setBackground(color);
					}
				}
				
				);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
		
	}

}
