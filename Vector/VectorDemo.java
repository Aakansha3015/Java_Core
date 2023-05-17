package Vector;
import java.util.*;
public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println(v);
		System.out.println("Default Capacity:"+v.capacity());
		
//		for(int i=1;i<=10;i++)
//		{
//			v.addElement(i);
//		}
		
		v.addElement("X");
		
		System.out.println(v);
		
	}

}
