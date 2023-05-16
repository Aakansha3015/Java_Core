package AbstractClass;

abstract class Bike 
{
	public void bike()
	{
		System.out.println("The bike is created...");
	}
	abstract void run();
	public void changeGear()
	{
		   System.out.println("The gear is changed..");
	}
}
