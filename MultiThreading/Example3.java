package MultiThreading;

public class Example3 extends Thread
{
	public void run()
		{
			for(int i=1;i<=5;i++)
			{
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			System.out.println(i);
			}
		}
		public static void main(String[] args)
		{
			Example3 e=new Example3();
			e.start();
		
			System.out.println(e.getId()); //1 This method is not of threads
			System.out.println(e.getName()); //Thread-0
			System.out.println(e.getPriority()); //Priority-5
			e.setPriority(9); // ?
			e.setName("Aakansha"); //?
		} 
}
