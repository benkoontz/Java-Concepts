package hello;

// composition means to refer to objects in other classes as members

public class potpie {
	private int month;
	private int day;
	private int year;
	
	public potpie(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}

	public String toString() { // to turn an object into a string look to the toString mehtod
		return String.format("%d/%d/%d", month, day, year);
	}
}
