package halo;

import java.util.*;

// A queue is closely related to a line at the grocery store. Whoever is up first has the highest priorty.
// In a queue the item that gets in the queue first has the highest priorty.

public class apples {
	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek()); // looks at element with highest priorty
		System.out.println();
		
		q.poll(); // remove first
		System.out.printf("%s ", q); 
	}
	
}
