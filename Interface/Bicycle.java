package Interface;

public class Bicycle implements Vehicle
{
	int speed,gear;
	
	public void changeGear(int newGear)
	{
		gear=newGear;
	}
	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	public void applyBrakes(int decrement)
	{
		speed=speed-decrement;		
	}
	 public void printStates() 
	 {
	        System.out.println("speed: " + speed+ " gear: " + gear);
	 }
	 
	 public static void main(String[] args)
	 {
		 Bicycle b= new Bicycle();
		 b.changeGear(100);
		 b.speedUp(70);
		 b.applyBrakes(20);
		 
		 System.out.println("Bike present state is:");
		 b.printStates();
	 }


}
