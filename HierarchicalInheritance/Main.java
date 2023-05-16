package HierarchicalInheritance;

public class Main 
{
	public static void main(String[] args)
	{
		TempEmployee t=new TempEmployee();
		PermanentEmp p=new PermanentEmp();
	
//		System.out.println(t.Employee());
//		System.out.println(t.TempEmployee());
//		System.out.println(p.PermanentEmp());
//		
		System.out.println("The total salary of temporary employee is:"+((t.Employee()*t.TempEmployee())+t.Employee()));
		System.out.println("The total salary of temporary employee is:"+((t.Employee()*p.PermanentEmp())+t.Employee()));
		
		
	}

}
