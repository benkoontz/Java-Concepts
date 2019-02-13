package halo;

// program that shows common string methods
public class apples {
	public static void main(String[] args) {
		
		String [] words = {"funk", "chunk", "furry", "baconator"};
		
		//starts with
		for(String w: words) {
			if(w.startsWith("fu"))
				System.out.println(w + " starts with fu");
		}
		
		// ends with
		for(String w: words) {
			if(w.endsWith("unk"))
				System.out.println(w + " ends with unk");
		}
			
		// index of finds the index of what you want to search for
		// find first character
		String s = "buckyrobertsbuckyroberts";
		System.out.println(s.indexOf('k')); // finds index of first k (starting at index 0)
		// find first string
		System.out.println(s.indexOf("rob", 5)); // 5 is index to start at
		
		// concatenate strings
		String a = "Bacon ";
		String b = "monster";
		System.out.println(a.concat(b));
		
		//replace
		System.out.println(a.replace('B','F')); // B is Replaced with F in the string Bacon
		
		// capatilize the string
		System.out.println(b.toUpperCase());
		
		// trim removes white spaces
		String c = "      monster     ";
		System.out.println(b.trim());
		
	
	}
}
