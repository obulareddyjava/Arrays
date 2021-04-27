package com.Arrays;

import javax.print.attribute.IntegerSyntax;

public class Arr {
	void m1(int[] a){
		System.out.println("Arr");
		
	}
	
}
class A extends Arr{
		void m2(int... b) {
			System.out.println("A");
		}
	

	public static void main(String[] args) {
		Arr a=new A();
		a.m1(null);
		
	}
}
