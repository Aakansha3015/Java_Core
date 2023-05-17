package ArrayList;

import java.util.ArrayList;

public class Null
{
	public static void main(String[] args)
	{
	   ArrayList<String> list = new ArrayList<String>();
	     list.add(null);
	     list.add(1, null);
	     list.add(1, null);
	     list.add(1, null);
	     list.add(1, "XYZ");
	     list.add(5,"y");
	     list.add(1,"y");
	     list.add(1,"i");
	   
	     System.out.println(list);
	  }	

}
