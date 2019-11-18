package com.package1;

public class Test2 {

	int x= 50;
	
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		Test2 obj = new Test2();
		obj.sum(a, b);
		
		//System.out.println(obj.x);
		System.out.println("Called flow from Main");
	//	Test4 ob4 = new Test4();
		//ob4.flow();
		
		
		

	}
	
	public  void sum(int a, int b)
	{
		int c= a+b;
		System.out.println("sum of local variables : "+c);
		System.out.println("Value of global variable : " +x);
	}
	
}
