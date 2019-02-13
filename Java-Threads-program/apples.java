package halo;

import java.util.*;

// A thread is a way a computer is allowed to do multiple things at once

// Runable interface contains run () method
public class apples implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public apples(String x) {
		name = x;
		time = r.nextInt(999); // random time is between 0 and 999
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch(Exception e) {
			
		}
	}
}
