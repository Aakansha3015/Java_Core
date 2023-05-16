package MethodOverloading;
//same method name with diff parameters
public class Example
{
	public int m1(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int m1(int x,int y,int z,int i)
	{
		int d=x*y*z*i;
		return d;
	}
	public int m1(int e,int f,int g)
	{
		int h=e+f+g;
		return h;
	}
	public static void main(String[] args)
	{	
		Example e=new Example();
		System.out.println(""+e.m1(10, 20));
		System.out.println(""+e.m1(10,40,20,7));
		System.out.println(""+e.m1(2, 3, 5));
	}


}
