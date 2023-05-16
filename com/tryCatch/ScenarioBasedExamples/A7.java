package com.tryCatch.ScenarioBasedExamples;

class Exc0 extends Exception 
{
} 

class Exc1 extends Exc0 { } /* Line 2 */
public class A7 
{ 
	    public static void main(String args[]) 
	    { 
	        try 
	        {  
	            throw new Exc1(); /* Line 9 */
	        } 
	        catch (Exc0 e0) /* Line 11 */
	        {
	            System.out.println("Ex0 caught"); 
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("exception caught");  
	        } 
	    } 
}

/*
 * Explanation:

	An exception Exc1 is thrown and is caught by the catch statement on line 11. 
	The code is executed in this block. There is no finally block of code to execute.
 */
