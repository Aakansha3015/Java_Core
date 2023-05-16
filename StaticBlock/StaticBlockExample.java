/*
 Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.*/
package StaticBlock;

public class StaticBlockExample
{
	
	public static void main(String[] args)
	{
		System.out.println("This is main method");
	}
	static {
		System.out.println("This is the static block");
	}	
}
