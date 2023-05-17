package ArrayList;
import java.util.ArrayList;
public class RemoveArrayListElement 
{
	  public static void main(String[] args) 
	  {
		  
	    ArrayList<String> animals = new ArrayList<String>();

	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Horse");
	    System.out.println("ArrayList: " + animals);

	    											
	    String str = animals.remove(2);								// remove element from index 2
	    
	    System.out.println("Updated ArrayList: " + animals);
	    System.out.println("Removed Element: " + str);
	  }
}

