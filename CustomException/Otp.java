package CustomException;
import java.util.Scanner;
public class Otp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the opt:");
		int otp=sc.nextInt();
		
		if(otp==111)
		{
			System.out.println("Valid opt");
		}
		else
		{
			throw new OTPException("Invalid otp");
		}
		
	}

}
