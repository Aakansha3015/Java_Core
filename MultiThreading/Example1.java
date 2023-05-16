package MultiThreading;
import java.util.Scanner;
public class Example1 extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the threads number:");
		int n=sc.nextInt();
		
		try
		{
			for(int i=0;i<=n;i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Example1 e=new Example1();
		e.start();
	}
}
