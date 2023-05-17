package ArrayList;
import java.util.*;

public class RemoveDuplicateArrayList 
{
	    public static void main(String[] args) 
	    {  
	        List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple");  
	        
	        System.out.println(l.toString());  	 //The toString method is used to return a string representation of an object. 
	        								   	// If any object is printed, the toString() method is internally 
	        								    // invoked by the java compiler.
	        
	        Set<String> s = new LinkedHashSet<String>(l);   
	        System.out.println(s);  
	        
	        
	        
	        
	    }  
}  


