//Design the method to return array list to method
package ArrayList;
import java.util.ArrayList;

public class ReturnArrayList 
{
	public ArrayList getEmployeeDetails()
	{
			ArrayList a=new ArrayList();
			a.add("Name : Aakansha");
			a.add("City : Pune");
			a.add("Edu : Mcs");
			a.add("Salary :50k");
			
			return a;
	}
	public static void main(String[] args)
	{
		ReturnArrayList e=new ReturnArrayList();
		System.out.println(e.getEmployeeDetails());
	}
	

}
