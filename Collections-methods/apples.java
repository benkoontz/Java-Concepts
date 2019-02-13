

package halo;

import java.util.*;

// Collections methods program
// Collections in Java refer to a single unit of objects. Some Java interface collections 
// (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).


public class apples {
	public static void main(String[] args) {
		
		String [] ben = {"apples", "lemons", "geese", "bacon", "youtube"};
		// convert array to list
		List<String> list1 = Arrays.asList(ben);
		
		// call methods from collection class to apply to list
		
		Collections.sort(list1); // alphabetical order
		System.out.printf("%s\n", list1);
		
		Collections.sort(list1, Collections.reverseOrder()); // reverse alphabetical order
		System.out.printf("%s\n", list1);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// create an array and convert to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> list2 = Arrays.asList(ray);
		System.out.println("list is : ");
		output(list2);
		
		// reverse and print out the list
		Collections.reverse(list2);
		System.out.println("after revers: ");
		output(list2);
		
		// create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		// copy contetnts of list2 into listCopy 
		Collections.copy(listCopy, list2); // take everything from list 2 and copy it to list copy
		System.out.println("Copy of list : ");
		output(listCopy);
		
		// fill collection with 
		Collections.fill(list2, 'x'); // fill every element in the list with an x
		System.out.println("after filling the list: ");
		output(list2);
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// add all
		//convert ben2 array to a list
		String[] ben2 = {"apples", "beef", "corn", "ham"};
		List<String> list3 = Arrays.asList(ben2);
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("youtube");
		list4.add("google");
		list4.add("digg");
		
		for(String x: list4) 
			System.out.println(x);
		
		Collections.addAll(list4, ben2); /// takes all elements from ben2 and copies it to list 4
		
		System.out.println();
		for(String x: list4)
			System.out.println(x);
		System.out.println();
		////////////////////////////////////////////////////////////////////
		// frequency method
		System.out.println(Collections.frequency(list4, "digg")); // goes through list 2 and sees if digg is in it, 
		//outputs 1
		// disjoint method
		boolean tof = Collections.disjoint(list3, list4);
		System.out.println(tof); // false means is that the elements have elements in common
		
		if (tof) 
			System.out.println("these lists do not have anything in common");
		else 
			System.out.println("these lists do have something in common");
	
		
		
		
	}
	
	//output method
	private static void output(List<Character> thelist) {
		for(Character thing: thelist)
			System.out.printf("%s ", thing);
		
		System.out.println();
	}
	
}
