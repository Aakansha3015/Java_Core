package ArrayList;
import java.util.*;
public class ArraylistToStringArray 
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Aakansha");
		a.add("Swapnali");
		a.add("Mrunal");
		a.add("Anagha");

		String b[] = new String[a.size()]; 					// ArrayList to String array conversion
		for(int i=0; i<a.size(); i++) 
		{
		      b[i]=a.get(i);
		}     
		for(String s : b) 
		{
		       System.out.println(s);      
		}
	}
}

