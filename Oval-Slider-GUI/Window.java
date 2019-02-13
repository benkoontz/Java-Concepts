package halo;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Window extends JFrame {
	
	private JSlider slider;
	private apples myPanel;
	
	public Window() {
		super("The title");
		myPanel = new apples();
		myPanel.setBackground(Color.GREEN);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10); // set ticks every 10 px
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						myPanel.setD(slider.getValue());
					}
				}
				
				
				
			);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
	}

}
