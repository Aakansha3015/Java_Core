package ArrayList;

import java.util.ArrayList;

public class RemoveAll 
{
	 public static void main(String[] args) 
	  {
		  
	    ArrayList<String> a= new ArrayList<String>();

	    a.add("Dog");
	    a.add("Cat");
	    a.add("Horse");
	    System.out.println("Before clear method ArrayList is: " + a);
									
	    a.clear();
	    
	    System.out.println(a);
	  }

}
