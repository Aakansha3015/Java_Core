package LinkedList;
import java.util.*;
public class MethodsOfLinkedlist 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		
		l.add(10);					//Index 0
		l.addFirst("Aakansha");		//Index 1
		l.addLast("Yash");			//Index 2
		l.add(1,"Shubham");			//Index 3
		l.add(l);					//Index 4
		l.add(null);				//Index 5
		l.add("Aakansha");
		l.add("Shubham");
		
		System.out.println(l);
		
//		LinkedList l2=new LinkedList();
//		l2.addAll(l);
//		System.out.println(l2);
		
//		System.out.println(l.get(0));
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
		
		
//		System.out.println(l.removeFirst());
//		System.out.println("Removed:"+l.removeLast());
//		System.out.println(l.remove(1));
		
//		System.out.println(l.removeFirstOccurrence("Aakansha"));
//		System.out.println(l);
	
//		System.out.println(l.removeLastOccurrence("Shubham"));
//		System.out.println(l);
		
//		System.out.println(l.removeAll(l));
//		System.out.println(l);
		
//		System.out.println(l.clone());
		
//		System.out.println(l.peek());
//		System.out.println(l.peekFirst());
//		System.out.println(l.peekLast());
//		
//		System.out.println(l.size());
	
		
	}

}
