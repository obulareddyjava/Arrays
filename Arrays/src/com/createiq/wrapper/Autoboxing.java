package com.createiq.wrapper;

public class Autoboxing {
	int a=10;
	public static void main(String[] args) {
		Autoboxing ae=new Autoboxing();
		//before java 5 we must use valueOf()
		Integer i=Integer.valueOf(ae.a);
		//converting primitive to wrapper 
		Integer j=ae.a;//from java5 we are not using the valueOf()
		System.out.println(ae.a+"\n "+i+"\t"+j);
	}

}
