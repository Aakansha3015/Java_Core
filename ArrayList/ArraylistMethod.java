// Program for demonstrate the arraylist method
package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistMethod 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add(10);
		a.add("Aakansha");
		a.add("Pune");
		a.add(11);
		a.add("Nikhil");
		a.add("Mumbai");
		a.add(12);
		a.add("Riya");
		a.add("Nashik");
		
		System.out.println(a);
		System.out.println("Riya is removed. "  +a.remove("Riya"));
		System.out.println(a.get(5));
		System.out.println(a.contains("Nikhil"));
		
		
	}
}
