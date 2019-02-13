package halo;

import java.util.*;

// A linked list inherits from the list interface and has more methods

public class apples {
	public static void main(String[] args) {
		
		String[] things = {"apples", "noobs", "pwng", "bacon", "goats"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for(String y: things2)
			list2.add(y);
		
		list1.addAll(list2); // takes everything from list 2 and adds it to list 1
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5); // remove from list 1 from 2 to 4
		printMe(list1);
		reverseMe(list1); // reverse everything in list 1
		
	}
	
	//printMe method
	private static void printMe(List<String> list) {
		for(String b : list)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
	//removeStuff method
	private static void removeStuff(List<String> list, int from , int to) {
		list.subList(from, to).clear(); // sublist and clear are built in methods
	}
	
	//reverseMe method
	private static void reverseMe(List<String> list) {
		ListIterator<String> bobby = list.listIterator(list.size()); 
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}
}
