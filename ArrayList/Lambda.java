package ArrayList;

import java.util.ArrayList;

public class Lambda 
{
	public static void main(String[] args)
	{
			ArrayList<String> list=new ArrayList<String>();
			
			list.add("Delhi");
			list.add("Mumbai");
			list.add("Pune");
		
			list.forEach((e) ->
			{
				System.out.println(e+" ");
			});
	}
}

