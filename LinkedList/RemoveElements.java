package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class RemoveElements 
{
	public static void main(String[] args)
	{
		LinkedList<String> a=new LinkedList<String>();
		
		a.add("C");
		a.add("Cpp");
		a.add("DSA");
		a.add("JAVA");
		a.add("Python");
		a.add("ML");
		
		System.out.println("Fist Linked list is :  "+a);
		
		a.remove(2);
		System.out.println("After invoking remove(index) method :  "+a);
		
		a.remove("Python");
		System.out.println("After invoking remove(Object)method : "+a);
		
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("1");
		a1.add("2");
		a1.add("3");
		a1.add("4");
		a1.add("5");
		System.out.println("Second Linked list is:" +a1);
		
		a.addAll(a1);
		//a.removeAll(a1);
		System.out.println(a);
		
		a1.removeFirst();
		System.out.println(a1);
		
		a1.removeLast();
		System.out.println(a1);
		
		a.removeFirstOccurrence("C");
		System.out.println(a);
		
		a.removeLastOccurrence("ML");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		
		
	}

}
