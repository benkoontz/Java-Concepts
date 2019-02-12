package halo;

import java.util.*;

// static means that all objects share the same static variable

class Ben {
	public static void main(String[] args) {
		tuna member1 = new tuna("Megan", "fox"); // members = 1
		tuna member2 = new tuna("natalie", "portman"); // members = 2
		tuna member3 = new tuna("taylor", "swift"); // members = 3
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers()); // prints 3 since getMembers is static
		System.out.println(member2.getMembers()); // prints 3 since getMembers is static
		System.out.println(member3.getMembers()); // prints 3 since getMembers is static
		
		// since getMembers is static, you can call the class directly
		System.out.println(tuna.getMembers()); // prints 3
				
		
	}
}
