package ArrayList;
import java.util.*;

public class SortingArrayList 
{
		public static void main(String[] args)
		{
		    List<Integer> list = new ArrayList<Integer>();
		    list.add(20);
		    list.add(10);
		    list.add(5);
		    list.add(30);
		    list.add(60);
		    
		    System.out.println("Original list: " +list);
		    
		    Collections.sort(list);
		   
		    System.out.println("Sorted list: " +list);
		  }
}

