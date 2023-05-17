package ArrayList;
import java.util.ArrayList;
public class ArraylistObject 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add("Aakansha");
		a.add(1000);
		a.add("Piyush");
		a.add(12345);
		a.add("Pune");
		
		for(Object o:a)
		{
			System.out.println(o);
		}
	}

}
