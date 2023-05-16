package LoopingStatements;

public class If_Else_If 
{
	public static void main(String[] args)
	{
		int per=67;
		
		if(per>90 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>=75 && per<=85)
		{
			System.out.println("First Class");
		}
		else if(per>=60 && per<=70)
		{
			System.out.println("Second higher class");
		}
		else if(per>=45 && per<=55)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Invalid input");
		}
		
	}

}
