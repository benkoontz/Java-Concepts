package hello;
import java.util.EnumSet; // used for using EnumSet range method

// Program that gives an example of enumeration  
// and uses an EnumSet range method. Enumerations are used for representing a group of named constants.
public class apples {
	
	public static void main(String[] args) {
		for(tuna people: tuna.values()) 
		System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		System.out.println("\nAnd now for the range of constants\n");  
		
		for(tuna people: EnumSet.range(tuna.kelsey, tuna.candy))	
		System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		
	}

}
