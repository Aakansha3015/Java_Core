package Interface;

public class TestMain implements Interface1 
{
	public void display()
	{
		System.out.println("Hello...");
	}
	
	public static void main(String[] args)
	{
		TestMain t=new TestMain();
		t.display();
	}

}
