package ArrayList;

import java.util.ArrayList;

public class Clone
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(30);
	
		System.out.println("Original list: " +list);
		
		System.out.println("Clone:"+list.clone());
	}
}
