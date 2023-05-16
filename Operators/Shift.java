package Operators;

// Left shift : x*2 ^ y;
// Right shift : x/2 ^y;

public class Shift 
{
	public static void main(String[] args)
	{
		int x=20;
		

		System.out.println(x<<2);  // 20*2^2 : 80   ||
		
		System.out.println(x>>2);  // 20/2^2 (20/4) : 5     ||
		
		System.out.println(x<<3);  // 20*3^2 : 160   		||
		
		System.out.println(x>>3);  // 20/3^2 : 2.2			||
	}
}

