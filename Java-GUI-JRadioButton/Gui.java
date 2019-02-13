package halo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// JRadioButton program


public class Gui  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JTextField tf;
	private Font pf; // plain font
	private Font bf; // bold font
	private Font itf; // italic font
	private Font bif; // bold italic font
	private JRadioButton pb; // plain button
	private JRadioButton bb; // bold button
	private JRadioButton ib; // italic button
	private JRadioButton bib; // bold and italic
	private ButtonGroup group; // make each button be apart of the family
	
	public Gui() {
		super("the title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Bucky is awesome", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true); // true is checked and false is unchecked
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold and italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup(); // anytime you add an element to the group it adds it to the group
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);	
		tf.setFont(pf); // set font when program starts
		
		
		// wait for event to happen, pass in font object to constructor
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));	
		
		
	}
	
	private class HandlerClass implements ItemListener {
		
		private Font font;
		
		// the font object gets the variable font
		public HandlerClass(Font f) {
			font = f;
		}
			
			public void itemStateChanged(ItemEvent event) {
				tf.setFont(font);
			}
		}
		

	
	}
