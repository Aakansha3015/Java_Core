package com.TypeOfRuntimeExceptions;

public class ArrayIndexOutOfBoundException
{
	public static void main(String[] args)
	{
		int arr[]= new int[5];
		
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		
		System.out.println(arr[3]);	
		
		/* **************************************************************************** */
		arr[10]=50;  //Exception will raise bcoz of index 10
		
		/*
		try
		{
			int a[]=new int[10];
			a[50]=200;
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		*/
	}

}
