package com.tryCatch.ScenarioBasedExamples;

public class A1
{
	  public static void main(String [] args) 
	    {
	        try 
	        {
	            badMethod();  
	            System.out.print("A"); 
	        }  
	        catch (Exception ex) 
	        {
	            System.out.print("B");  
	        } 
	        finally 
	        {
	            System.out.print("Final block...");  
	        } 
	        System.out.print("D"); 
	    }  
	    public static void badMethod() 
	    {
	        throw new Error(); /* Line 22 */
	    } 
}

/*
 
	Explanation:

	Error is thrown but not recognised line(22) because the only catch attempts to catch an Exception 
	and Exception is not a superclass of Error. Therefore only the code in the finally statement 
	can be run before exiting with a runtime error (Exception in thread "main" java.lang.Error).
 
*/


