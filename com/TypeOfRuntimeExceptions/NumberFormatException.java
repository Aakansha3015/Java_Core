package com.TypeOfRuntimeExceptions;
import java.lang.Exception;

public class NumberFormatException 
{
	public static void main(String[] args)
	{
		String inputString="135.33";
		
		try
		{
			int a=Integer.parseInt(inputString);
		}
		catch(Exception e)
		{
			//System.err.println("Number in invalid"+e);
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}

/*
  	Example- Integer.parseInt("135"); The maximum possible value of integer can be 127, 
  	but the value in the string is 135 which is out of range, so this will throw the exception.
*/

