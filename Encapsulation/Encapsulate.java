package halo;

public class Encapsulate {
	
    // private variables 
    // these variables cannot be accessed directly due to encapsulation
    private String Name; 
    private int ID; 
    private int Age; 
  
    // the get methods are used to access variables
    // the set Methods are used to set the variables

    public int getAge()  
    { 
      return Age; 
    } 
   
    public String getName()  
    { 
      return Name; 
    } 
      
    public int getID()  
    { 
       return ID; 
    } 
   
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
   
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
      
    public void setID( int newID)  
    { 
      ID = newID; 
    } 

}
