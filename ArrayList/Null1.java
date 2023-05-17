package ArrayList;
import java.util.ArrayList;
public class Null1 
{
	public static void main(String[] args)
	{
		   ArrayList<String> list = new ArrayList<String>();
		    //list.add(null);
		    list.add(0, "A");
		    //list.add(null);
		    list.add(1, "C");
		    list.add(2, "B");
		    list.add("20");
		    list.add(null);
		    list.add(3, "X");
		   
		   System.out.println(list);
	}
}
