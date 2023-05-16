package Interface;
public class Animal implements AnimalEat,AnimalTravel 
{
	public void eat()
	{
		System.out.println("Animal eats...");
	}
	public void travel()
	{
		System.out.println("Animal Travel...");
	}
	
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.eat();
		a.travel();
	}

}
