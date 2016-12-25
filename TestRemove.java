package Core_javaS9;
import java.util.*;
public class TestRemove {

	public static void main(String[] args) {
		// create an empty array list   
	    ArrayList<String> color_list = new ArrayList<String>();  
	  
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	     
	   // create an empty array sample with an initial    
	    ArrayList<String> sample = new ArrayList<String>();  
	      
	   // use add() method to add values in the list   
	    sample.add("Green");   // case sensitive
	    sample.add("Violet");   
	    sample.add("white");   // case sensitive
	      
	   // remove all elements from second list if it exists in first list  
	    sample.removeAll(color_list); 
	    
	    Iterator b1=color_list.iterator();
	    Iterator b2=sample.iterator();
	    System.out.println("*******************************");
	    while(b1.hasNext())
	    {
	    	System.out.println( b1.next());
	    }
	    System.out.println("*******************************");
	    System.out.println("*******************************");
	    while(b2.hasNext())
	    {
	    	System.out.println( b2.next());
	    }
	    System.out.println("*******************************");  
	   
		

	}

}
