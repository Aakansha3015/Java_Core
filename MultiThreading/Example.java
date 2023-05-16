package MultiThreading;

public class Example extends Thread
{
	public void run()
	{
		System.out.println("Enter the thread:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}	
	}
	public static void main(String[] args)
	{
		Example e=new Example();
		e.start();
	}

}
