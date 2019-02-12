package halo;

public class Singleton {
	
    private static Singleton single_instance = null;  // static variable single_instance of type Singleton 
    public String s; 
  
    // first make a constructor private
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 

}
