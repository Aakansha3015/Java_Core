package SingleInheritance;

public class Rectangle extends Shape
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		System.out.println("Area of rectangle is:"+r.Area(30, 60));
	}

}
