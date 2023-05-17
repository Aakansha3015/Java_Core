package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class SortArrayList 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("X");
		a.add("E");
		a.add("Z");
		a.add("Y");
		a.add("A");
		
		Collections.sort(a);
		
		System.out.println("Sorted arraylis is:"+a);
	}
}

/*java.lang.Integer cannot be cast to java.lang.String*/