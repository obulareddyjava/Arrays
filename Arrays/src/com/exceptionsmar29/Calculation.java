package com.exceptionsmar29;

public class Calculation extends Exception{
	public Calculation(){
		System.out.println("Constructor instantianted");
	}
	static void add(int a,int b) {
		System.out.println("The Sum is: "+(a+b));
	}
}
	
	