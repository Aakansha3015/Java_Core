package com.tryCatch.ScenarioBasedExamples;
public class A2 
{ 
	    public static void main(String [] args) 
	    {
	        try 
	        {
	            badMethod();  
	            System.out.print("A");  //Will not exceute
	        } 
	        catch (RuntimeException ex) /* Line 10 */
	        { 
	            System.out.print("B"); 
	        } 
	        catch (Exception ex1) 
	        { 
	            System.out.print("C"); 
	        } 
	        finally 
	        {
	            System.out.print("D"); 
	        } 
	        System.out.print("E"); 
	        
	    } 
	    public static void badMethod() 
	    { 
	        throw new RuntimeException(); 
	    } 
	}

/*
	Ans : BDE
	Explanation:

A Run time exception is thrown and caught in the catch statement on line 10. 
All the code after the finally statement is run because the exception has been caught.
*/
