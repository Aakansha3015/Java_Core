package com.tryCatch.ScenarioBasedExamples;

public class A5 
{
		public static void main(String [] args) 
	    {
	        try 
	        {
	            badMethod();				 	/* Line 7 */
	            System.out.print("A"); 
	        } 
	        catch (Exception ex) 				/* Line 10 */
	        {
	            System.out.print("B"); 			/* Line 12 */
	        } 
	        finally 							/* Line 14 */
	        {
	            System.out.print("C"); 			/* Line 16 */
	        }  
	        System.out.print("D"); 				/* Line 18 */
	    } 
	    public static void badMethod() 
	    {
	        throw new RuntimeException(); 
	    } 
}

/*
 	Explanation:

	(1) A RuntimeException is thrown, this is a subclass of exception.

	(2) The exception causes the try to complete abruptly (line 7) therefore line 8 is never executed.

	(3) The exception is caught (line 10) and "B" is output (line 12)

	(4) The finally block (line 14) is always executed and "C" is output (line 16).

	(5) The exception was caught, so the program continues with line 18 and outputs "D".

*/
