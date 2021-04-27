package com.createiq.wrapper;

public class Unboxing {
	
	public static void main(String[] args) {
		Integer i=new Integer(2);
		//convert wrapper into primitive type
		int j=i;
		int k=i.intValue();
		
		System.out.println(j);
		System.out.println(k);
	}

}
