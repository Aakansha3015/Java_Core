package Set;
import java.io.*;   
import java.util.*;   
public class IteratorMethod 
{
	    public static void main(String args[])   
	    {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        data.add(51);   
	        data.add(11);   
	        data.add(81);   
	        System.out.println("data: " + data);  
	          
	        Iterator itr = data.iterator();  
	        
	        System.out.println("The NewData values are: ");   
	        while (itr.hasNext())
	        {   
	            System.out.println(itr.next());   
	        }  
	    }   
}  
