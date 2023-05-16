package LoopingStatements;
public class For 
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++)//Print number 1 to 10
		{
			System.out.println(i);
		}

		
		for(int i=1;i<=100;i++) //Even Number between 1 to 100
		{
			if(i%2==0)
			{
				System.out.println(" "+i);
			}
		}
				
		
		for(int i=10;i>0;i--) //Reverse number print from 10 to 1
		{
			System.out.println("reverse numbers:"+i);
		}
		
		
		for(int i=1;i<=5;i++) //Display a Text Five Times
		{
			System.out.println("Hello everyone!");
		}
			
			
		for(int i=1;i<=10;i--)//Java Infinite for Loop
		{
			System.out.println("Infinite loop");
		}
			
		for(;;)
		{
			System.out.println("Infinitive loop");
		}
	}
}

