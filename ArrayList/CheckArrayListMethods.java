package ArrayList;
import java.util.ArrayList;
public class CheckArrayListMethods
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
				
		a.add(10);
		a.add(40);
		a.add(100);
		a.add(200);
				
		System.out.println("Check if the element is present or not : "+a.contains(20));
		System.out.println("Size of elements : "+a.size());
		System.out.println("Array list is:"+a);
		System.out.println("Clone of given arraylist:"+a.clone());
		System.out.println(a.remove(3));
		System.out.println("Added "+a.add(90));
		System.out.println(a);
	}
}
	
