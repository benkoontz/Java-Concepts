package halo;

import java.util.*;

// hash tables map keys to values
// has tables are kind of like a dicitonary
// you can access elements in O(1) time
// hash tables aren't useful if your data needs ordering


class Ben {
	public static void main(String[] args)
	{
	
	// create the hash table
	Hashtable<Integer, String> table = new Hashtable<Integer, String>();
	
	table.put(1, "ben");
	table.put(2, "hello");
	table.put(3, "yep");
	
	System.out.println("values " + table); // print out the entire hash table
	System.out.println("value 1 is " + table.get(1)); // prints value 1 is ben 
	
	table.putIfAbsent(4, "nope");
	System.out.println(table); // adds the value nope
	
	// check if a value is contained
	System.out.println("is the value ben present? " + table.contains("ben")); // prints true
	
	// check if a key exists
	if (table.containsKey(2)) 
		System.out.println("key found in table");
	
	table.remove(3); // removes third value
	System.out.println(table);
	
	System.out.println("size is " + table.size()); // prints the size
	
	System.out.println("collection values " + table.values()); // prints the values
	
	
	}
}
