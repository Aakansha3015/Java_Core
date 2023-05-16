/*The static keyword in Java is used for memory management mainly. We can apply 
 * static keyword with variables, methods, blocks and nested classes. 
 * The static keyword belongs to the class than an instance of the class.*/
package StaticVariables;

public class StaticVarExample
{
	static int  a=10;
	
	public static void main(String[] args)
	{
		
		StaticVarExample s=new StaticVarExample();
		System.out.println("Static variable using class name:"+StaticVarExample.a);
		System.out.println("Static varibale using variable name:"+a);
		System.out.println("Static variable using object:"+s.a);
	}

}
