package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIterate 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		
		linkedlist.add(50);
		linkedlist.add(51);
		linkedlist.add(52);
		linkedlist.addFirst(49);
		linkedlist.addLast(60);
		linkedlist.add(53);
		linkedlist.add(54);
		linkedlist.add(55);
		
		int a=linkedlist.get(0);
		System.out.println("Element at 0th index is:"+a);
		
		Iterator<Integer> itr=linkedlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
