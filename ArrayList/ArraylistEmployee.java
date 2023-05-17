package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEmployee 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> a=new ArrayList<Employee>();
		
		a.add(new Employee(111,"Aakansha","Pune"));
		a.add(new Employee(222,"Pratiksha","Mumbai"));
		a.add(new Employee(333,"Arya","Nagpur"));
		
		//By usig while loop
		Iterator<Employee> itr=a.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println("Employees list:"+itr.next());
		}
		
		
		//By using for each loop
		
		for(Employee x:a)
		{
			System.out.println(x);
		}
			
	}

}
