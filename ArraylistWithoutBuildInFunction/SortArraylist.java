package ArraylistWithoutBuildInFunction;
import java.util.*;
public class SortArraylist 
{
	public static void main(String[] args)
	{
		    ArrayList a = new ArrayList();
		    a.add("reena");
		    a.add("teena");
		    a.add("anu");
		    a.add("zahir");
		    a.add("sonu");
		    System.out.println("Unsorted Arraylist:");
		    System.out.println(a);
		    
		    int count=a.size();
		    String temp;
		    
		    Object x[] = a.toArray();   //Covert ArrayList into array
		    
		    for (int i=0; i<count; i++) 
		    {
		      for (int j=i+1; j<count; j++) 
		      {
		        if(((String)x[i]).compareTo((String)x[j])> 0) 
		        {
		          temp =(String)x[i];
		          x[i] = x[j];
		          x[j] = temp;
		        }
		      }
		    }
		    System.out.println("Sorted Arraylist:");
		    for (int z=0; z<x.length; z++) 
		    {
		      System.out.println(x[z]);
		    }
	}		
}
