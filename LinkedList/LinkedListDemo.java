package LinkedList;
import java.util.*;
public class LinkedListDemo 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		
		l.add("Aakansha");
		l.add("Pune");
		l.add(null);
		l.add(23);
		l.add("Msc");
		l.add(2,"Mumbai");
		
		Iterator<Object> t=l.iterator();
		{
			while(t.hasNext())
			{
				System.out.print(t.next()+"->");
			}
		}
//		for(Object o:l)
//		{
//			System.out.println(o);
//		}
	}

}
