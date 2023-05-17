package ArrayList;
import java.util.ArrayList;
public class AddAll
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Banana");
		a.add(0,"Apple");
		
		
		ArrayList<String> b=new ArrayList<String>();
		
		b.add("Mango");
		b.add(1,"Orange");
		
		a.addAll(1,b);
		
		System.out.println((a));
		
	}

}
