package ArrayList;
import java.util.*;
public class Reverse 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(30);
		
		System.out.println("Original list: " +list); // 20, 10, 5, 30
		Collections.reverse(list);
		System.out.println("Reversed list: " +list); // 30, 5, 10, 20	
	}
}
