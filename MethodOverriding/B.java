package MethodOverriding;

public class B extends A
{
	public int m1(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		B b=new B();
		System.out.println(b.m1(11,22));
		
	}

}
