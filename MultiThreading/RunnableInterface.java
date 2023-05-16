package MultiThreading;

public class RunnableInterface implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		RunnableInterface r=new RunnableInterface();
		Thread t=new Thread(r);
		t.start();
		
	}

}
