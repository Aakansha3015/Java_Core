//Program for copy one arraylist into another arraylist using iterator.
package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class CopyOneArraylistToOther 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add(10);
		a.add("Aakansha");
		a.add(20);
		a.add("Nikhil");
		a.add(30);
		a.add("Rudra");
		a.add(40);
		
		System.out.println("The arrayList is:"+a);
		
		ArrayList c=new ArrayList();
		
		a.add(111);
		a.add(333);
		a.add(5555);
		c.addAll(a);
		
		System.out.println("After adding the a:"+c);
	}
}
