package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class MergeArrayList 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		ArrayList b=new ArrayList();
		
		b.add("Pune");
		b.add("Mumbai");
		b.add("Nashik");
		
		b.add(a);
		System.out.println("After merging 2 arraylist:"+b);
	}

}
