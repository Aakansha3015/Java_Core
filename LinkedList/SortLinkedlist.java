package LinkedList;
import java.util.*;
public class SortLinkedlist
{
	public static void main(String[] args)
	{
		    LinkedList a = new LinkedList();
		    a.add("reena");
		    a.add("teena");
		    a.add("anu");
		    a.add("zahir");
		    a.add("sonu");
		    System.out.println("Unsorted Linkedlist:");
		    System.out.println(a);
		    
		    int count=a.size();
		    String temp;
		    
		    Object x[] = a.toArray();   //Covert LinkedList into array
		    
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
		    System.out.println("Sorted Linkedlist:");
		    for (int z=0; z<x.length; z++) 
		    {
		      System.out.print(x[z]+"->");
		    }
	}		
}
