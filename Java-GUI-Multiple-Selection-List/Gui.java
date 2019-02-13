package halo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Multiple Selection list program


public class Gui  extends JFrame { // JFrame gives all the basic windows features (minmize button, X button, etc)
	
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] foods = {"bacon", "wings", "ham", "beef", "more bacon"};
	
	public Gui() {
		super("title");
		setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3); // see 3 items by default
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist)); // allows to have a list bigger than the default viewing (adds a scrollbar)
		
		movebutton = new JButton("Move -->");
		movebutton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event)  {
					rightlist.setListData(leftlist.getSelectedValues());
				}
				
			}
			
			);
		add(movebutton);
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		
	}
	

	

	
}
