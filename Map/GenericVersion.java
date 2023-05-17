package Map;
import java.util.*;  
public class GenericVersion
{
	 public static void main(String args[])
	 {  
		 Map<Integer,String> map=new HashMap<Integer,String>();  
		 
		 map.put(100,"Amit");  
		 map.put(101,"Vijay");  
		 map.put(102,"Rahul");  
	  
		 System.out.println(map);
		 
		//Elements can traverse in any order  
		 
		 for(Map.Entry m:map.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue());
		 }
	 }  
}  
