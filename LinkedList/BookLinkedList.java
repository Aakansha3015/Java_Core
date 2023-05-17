package LinkedList;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class BookLinkedList 
{
	public static void main(String[] args)
	{
		List<Book> a=new LinkedList<Book>();  //Creating list
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);       //Creating books
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		a.add(b1);
		a.add(b2);
		a.add(b3);
		
		 for(Book b:a)
		 {  
			    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		 }
	}
}