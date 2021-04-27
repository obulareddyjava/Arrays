package com.exceptions;



public class StackOverFlowEXx {
	void m1() {
		System.out.println("I ma M1");
		m1();
	}
	public static void main(String[] args) {
		StackOverFlowEXx sof=new StackOverFlowEXx();
		sof.m1();
	}
}
