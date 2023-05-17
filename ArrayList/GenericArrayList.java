//Program for design generic arraylist for Integer type only using for each loop or for enhanced loop
package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class GenericArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
	
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
