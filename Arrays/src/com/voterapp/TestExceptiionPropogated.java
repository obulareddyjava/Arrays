package com.voterapp;

public class TestExceptiionPropogated {
		static void m1() {
			System.out.println("m1");
	System.out.println(10/0);
}
		static void m2() {
			m1();
		}
		static void m3() {
		m2();	
		try {
			m2();
		}catch(ArithmeticException e) {
			e.getMessage();		}
		}
		public static void main(String[] args) {
			m3();
			
		}
	
}
