package com.exceptionsmar29;

public class ExceptionHierarchy {
	public static void main(String[] args)  {
		try {
			int a=1/0;
			
		}
		
		catch(ArithmeticException e) {
			throw new ArithmeticException ();
			
			
		}
	/*	catch(ArithmeticException e) {
			
		}*/
	}

}
