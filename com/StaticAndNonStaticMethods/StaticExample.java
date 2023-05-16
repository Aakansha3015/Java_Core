package com.StaticAndNonStaticMethods;

public class StaticExample 
{
	public static void Student()
	{
		System.out.println("This is an static method!!");
	}
	public static void main (String[] args)
	{
		Student();  							//By using the method name
		StaticExample.Student(); 				//By using the Class.method name
		
		StaticExample s=new StaticExample();	//By using creatig the object
		s.Student();			
	}
}
