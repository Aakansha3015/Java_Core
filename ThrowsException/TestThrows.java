package ThrowsException;

public class TestThrows 
{
	public static int m1(int a,int b) throws ArithmeticException
	{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) throws ArithmeticException
	{
		TestThrows t=new TestThrows();
		try
		{
			System.out.println("Output is: "+t.m1(10,0));
		}
		catch(ArithmeticException a)
		{
			System.out.println("Number cannot be divided by zero");
		}
		System.out.println("Rest of the code...");
	}
}
