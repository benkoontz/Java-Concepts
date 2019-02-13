package halo;

import java.util.*;

// Converting lists to arrays. Java has methods you can only do to arrays and methods you can
// only do to lists.

public class apples {
	public static void main(String[] args) {
		
		String [] stuff = {"games", "watermelon", "fudge"};
		// change stuff arrau to a list
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff)); 
		
		thelist.add("pumpkin");
		thelist.addFirst("firstthings");
		
		// convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x: stuff) // loop through array
			System.out.printf("%s ", x);
		
		
	}
}
