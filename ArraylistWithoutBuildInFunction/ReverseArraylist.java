// Java program for reversing an arraylist
package ArraylistWithoutBuildInFunction;
import java.io.*;
import java.util.*;
public class ReverseArraylist 
{	
		public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
		{
			// Arraylist for storing reversed elements (this.revArrayList = alist;)
			for (int i = 0; i < alist.size()/2; i++) 
			{
				Integer temp = alist.get(i);
				alist.set(i, alist.get(alist.size()-i-1));
				alist.set(alist.size() - i - 1, temp);
			}
			return alist;
		}
		public void printElements(ArrayList<Integer> alist)				// Iterate through all the elements and print
		{
			for (int i=0; i<alist.size();i++) 
			{
				System.out.print(alist.get(i) + " ");
			}
		}
}
