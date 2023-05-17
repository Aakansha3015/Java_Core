package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class Number 
{
	private int no;
	
	public Number(int no)
	{
		this.no=no;
	}
	public int getNo()
	{
		return no;
	}
	public void setNo(int no)
	{
		this.no=no;
	}
	@Override
	public String toString() 
	{
		return "Number [no=" + no + "]";
	}
}
