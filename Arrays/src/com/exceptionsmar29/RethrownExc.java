package com.exceptionsmar29;

public class RethrownExc {
	public static void main(String[] args) {

	try {
		int a=1/0;
		
	}catch(ArithmeticException e) {
		throw new ArithmeticException ();
		
		
	}
}
}
