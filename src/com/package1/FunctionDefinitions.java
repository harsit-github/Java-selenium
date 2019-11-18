package com.package1;

public class FunctionDefinitions 
{
	
	public void sample()
	{
		int a= 50; int b = 90;
		FunctionDefinitions obj = new FunctionDefinitions();
		obj.multiplication(a, b);
		System.out.println("Sample");
	}

	public int multiplication(int a, int b)
	{
		int  m = a*b;
		System.out.println("inside Multiplication class");
		
		return m;
	}
	
	
	public void Method()
	{
		System.out.println("Inside Method Non statis");
	}
	
}
