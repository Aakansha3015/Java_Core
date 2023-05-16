package LoopingStatements;

public class Nested_if 
{
	public static void main(String[] args)
	{
		int a=10,b=20;
		
		if(a==10)
		{
			if(b!=20)
			{
				System.out.println("Nested if will execute");
			}
			else
			{
			System.out.println("Nested else will execute");
			}
		}
	}
}
