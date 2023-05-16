package Encapsulation;

public class Main
{
	public static void main(String[] args)
	{
		Student s=new Student();
		
		s.setRollno(111);
		s.setName("Aakansha");
		
		System.out.println("The rollno is"+s.getRollno());
		System.out.println("The name is:"+s.getName());
	}

}
