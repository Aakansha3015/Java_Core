package com.TypeOfRuntimeExceptions;

public class NullPointerException 
{
	public static void main(String[] args)
	{
		
		/*
		 * 	String str=null;
			System.out.println(str.length());	
		*/
		
		try
		{
			String str=null;
			System.out.println(str.length());	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}

