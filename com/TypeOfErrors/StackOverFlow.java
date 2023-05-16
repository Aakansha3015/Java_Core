package com.TypeOfErrors;
/*
That function calls itself repeatedly with no termination condition. 
Consequently, the stack fills up because each call has to push a return address on the stack, 
but the return addresses are never popped off the stack because the function never returns, 
it just keeps calling itself.
*/

public class StackOverFlow 
{
		public static final void main(String[] args) 
		{
			main(args);
		}
}
