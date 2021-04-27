package com.createiq.wrapper;

public class EqualsMethod {
	public static void main(String[] args) {
		//object of integer class
		Integer i=new Integer(5);
		//object of byte class
		Byte b=new Byte((byte) 5);
		
		EqualsMethod e=new EqualsMethod();
		EqualsMethod h=new EqualsMethod();
		System.out.println(e.equals(h));
		
		Float f=new Float(5f);
		
		System.out.println(i.equals(b));
		System.out.println(i.equals(5));
		}

}
