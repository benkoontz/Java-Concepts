import java.util.Vector; // used for vectors

// vectors are arrays with one big difference: the size of vectors can change
// This program shows examples of how to use vectors in Java

public class VectorExample {
	

public static void main (String[] args) {
	Vector<Integer>vec1 = new Vector<Integer>(); // create a vector of integers
	//Vector vec2 = new Vector(10); // vector of size 10
	//Vector vec3 = new Vector(10,5); // when the vector hits 10 elements the size will increase by 5
	
	vec1.add(42);
	vec1.add(7);
	vec1.add(35);
	vec1.add(42);
	vec1.add(7);
	vec1.add(35);
	vec1.add(42);
	vec1.add(7);
	vec1.add(42);
	vec1.add(7);
	vec1.add(5);
	
	System.out.println("Size: " + vec1.size());	/// get the size of the vector
	System.out.println("Capacity: " + vec1.capacity());  // get the capacity of the vector
	vec1.remove(1); // remove 2nd element of the vector
	//vec1.removeAllElements(); // removes all elements in the vector
	int index = vec1.indexOf(35); // find the index of the element
	System.out.println("index " + index); // finds the index of the vector
	vec1.insertElementAt(5, 3); // insert the value 5 in the fourth place in the vector
	
	
	System.out.println("value 0: " + vec1.get(0)); // get the value of first element in the vector
	
	
	for (int i = 0; i < vec1.size(); i++) {	// print all elements of the vector
		System.out.println("Value for index" + i + " " + vec1.get(i));
	}
	
	
	
	
	}
}
