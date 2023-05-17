package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class AddingListSpecificPosition 
{
	public static void main(String[] args)
	{
		LinkedList<String> a=new LinkedList<String>();
		
		a.add("Aakansha");   //Index 0
		a.add("Yash");		//Index 1
		a.add("Priyanka");	//Index 2
		a.add("Prajwal");
		
		LinkedList<String> a1=new LinkedList<String>();	
		
		a1.add("Pune");
		a1.add("Mumbai");
		a1.add("Delhi");
		a1.add("Goa");
		
		a.addAll(2,a1);    //From Yash onwards this list will be added
		
		//System.out.println(a);
		//System.out.println(a1);
		
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

