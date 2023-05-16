package CustomException;
import java.util.Scanner;
public class Age 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Valid exception");
		}
		else
		{
			throw new InvalidAgeException("Age is invalid");
		}
	}
}
