package com.tryCatch.ScenarioBasedExamples;

public class A3 
{
	    public static void throwit () 
	    {
	        System.out.println("1] throwit ");
	        throw new RuntimeException();  //sub class of Exception
	    }
	    public static void main(String [] args) 
	    {
	        try 
	        {
	            System.out.println("2] hello ");
	            throwit();
	        }
	        catch (Exception re ) 
	        {
	            System.out.println("3] caught ");
	        }
	        finally 
	        {
	            System.out.println("4] finally ");
	        }
	        System.out.println("5] after ");
	    }
}
/*
 		Ans : hello throwit caught finally after 
 		
 		Explanation:	
 				The main() method properly catches 
 				and handles the RuntimeException in the catch block, 
 				finally runs (as it always does), and then the code returns to normal.

 */
