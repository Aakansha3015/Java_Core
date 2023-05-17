package ArrayList;
import java.util.ArrayList;
import java.util.*;
public class ArrayListIntoList
{
	    public static void main(String args[]) 
	    {
	     
	      String cities[]={"Boston", "Dallas", "New York", "Chicago"};
	  
	      ArrayList<String> list= new ArrayList<String>(Arrays.asList(cities));        //Converting Array to ArrayList using Arrays.asList()
	      
	      list.add("San Francisco");
	      list.add("San jose");
	      
	      for(String s : list) 
	      {
	        System.out.println(s);      
	      }
	    }
}
