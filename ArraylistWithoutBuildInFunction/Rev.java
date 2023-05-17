package ArraylistWithoutBuildInFunction;
import java.util.ArrayList;

public class Rev
{
	public static void main(String[] args)
		{
			ReverseArraylist obj = new ReverseArraylist();
			
			ArrayList<Integer> arrayli = new ArrayList<Integer>();

			arrayli.add(new Integer(12));
			arrayli.add(new Integer(13));
			arrayli.add(new Integer(123));
			arrayli.add(new Integer(54));
			arrayli.add(new Integer(1));
			System.out.print("Elements before reversing: ");
			obj.printElements(arrayli);
			arrayli = obj.reverseArrayList(arrayli);
			System.out.print("\nElements after reversing: ");
			obj.printElements(arrayli);
		}
}
