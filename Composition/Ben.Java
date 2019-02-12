package halo;

import java.util.*;

// Composition is a relationship where both objects are dependent on each other

// Example: books in a library
// A library needs books and the books need a library

class Ben extends constructor
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    { 
    	
       Book bookObj1 = new Book("bens book 1", "ben 1");
       Book bookObj2 = new Book("bens book 2", "ben 2");
       
       List<Book> books = new ArrayList<Book>();
       
       books.add(bookObj1);
       books.add(bookObj2);
       
       Library libraryObj = new Library(books);
       
       List<Book> bks = libraryObj.getTotalBooksInLibrary();
       
       for(Book bk: bks) {
    	   System.out.println("Title " + bk.title + " and author " + bk.author);
       }
       
       
       
       
       
    } 
} 
