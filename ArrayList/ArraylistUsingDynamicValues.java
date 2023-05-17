package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ArraylistUsingDynamicValues 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		for(int i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 5 mobile number:");
			int mobilenumber=sc.nextInt();
		
			a.add(mobilenumber);
		}
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println("5 mobile no is:"+itr.next());
		}
		
	}

}
