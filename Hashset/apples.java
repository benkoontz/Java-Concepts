package halo;

import java.util.*;

// A hashset is a collection that cannot contain any duplicate items. A hashset takes a collection and if it finds a duplicate item
// it removes that item.

public class apples {
	public static void main(String[] args) {
		
		String [] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
	}
	
}
