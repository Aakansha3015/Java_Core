package Stack;
import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		
		System.out.println("Push : "+s);
		
		s.pop();
		System.out.println("Pop :"+s);
		
		s.peek();
		System.out.println("Peek :"+s);
		
		System.out.println(s.search("x"));  //If element not found then return -1
			
	}

}
