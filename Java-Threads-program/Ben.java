package halo;

import javax.swing.JFrame;

//A thread is a way a computer is allowed to do multiple things at once

public class Ben {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new apples("one"));
		Thread t2 = new Thread(new apples("two"));
		Thread t3 = new Thread(new apples("three"));
		Thread t4 = new Thread(new apples("four"));
		
		// start thread example
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
