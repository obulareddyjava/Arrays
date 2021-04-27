package com.exceptions;

public class ExExecution {
	static int m1(){
		return 1;
	}
	public static void main(String[] args) {
	
	try {	System.out.println("One");
		System.out.println("Two"+(10/0));
		System.out.println("Three");
		System.out.println("Four");
	}catch(ArithmeticException e)
	{
		
		e.printStackTrace();
		//System.out.println(e.toString());
		e.toString();
		System.out.println("Two"+(10/0));
	}
	
		
	}

}
