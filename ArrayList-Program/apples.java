package halo;

import java.util.*;

// A collection is like an array. However a collection is dynamic - meaning you don't have to give it a number and
// This program removes items from list 1 if the items are contained in list 2.

public class apples {
	public static void main(String[] args) {
		
		String[] things = {"eggs", "lasers", "hats", "pie" };
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for (String x: things) {
            list1.add(x);
        }

        String[] morethings = {"lasers", "hats" };
        List<String> list2 = new ArrayList<String>();

        //add array items to list
        for (String y: morethings) {
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++) 
        	System.out.printf("%s ", list1.get(i));
		
		editlist(list1,list2);
		System.out.println();
		
		// print out list  1
		for(int i = 0; i < list1.size(); i++) 
			System.out.printf("%s ",list1.get(i));

}

	
public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator(); // create iterator to loop through the items
		while(it.hasNext()) { // loop 
			if(l2.contains(it.next())) // if item is in list number 2 remove it from list number1
				it.remove();
	}
}
}
