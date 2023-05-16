package Operators;

public class AndOR
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a<b && b<c); // T && T = True

		System.out.println(a>b || b>c); // F || F = False
		
		System.out.println(a<b & b>c); // T & F = False
		
		System.out.println(a<b | b<c);// F | F = False

	}
}























/*
 * 
 * if(a<b && b<c)  // T : T = T
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
*/	