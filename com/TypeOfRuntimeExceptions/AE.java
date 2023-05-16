package com.TypeOfRuntimeExceptions;

public class AE 
{
	public static void main(String[] args) 
	{
		try
		{
			int x=0;
			int y=10/x;
		}
		catch (ArithmeticException ae)  //Class name and exception name should be different
		{
			System.out.println(ae);
			
		}
	}
}
