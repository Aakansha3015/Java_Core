package Vector;
import java.util.Vector;
import java.util.Iterator;

public class VectorRemove 
{
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		
		System.out.println("Capacity of vector is:"+v.capacity());
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("C");
		
		v.remove(4);
		System.out.println(v);
		
		System.out.println("Vector is:"+v);
		while(v.contains("C"))
		{
			v.remove("C");
		}
		System.out.println("Size of vector is: "+v.size());
		System.out.println("Element present at 2nd index is: "+v.get(2));
		System.out.println("New vector is:"+v);
		
	}

}
