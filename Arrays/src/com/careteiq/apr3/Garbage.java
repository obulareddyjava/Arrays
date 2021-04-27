package com.careteiq.apr3;

import com.createiq.apr2.main;

public class Garbage {
	
	@Override
	protected void finalize() throws Throwable {
	System.out.println("calling finalize method");
	}
	public static void main(String[] args) {
		Garbage g=new Garbage();
		Garbage g1=new Garbage();
		Garbage g3=new Garbage();
		Garbage g2=new Garbage();
		//automatically g is eligible for gc
		g=g1;
		g2=g3;
	
		
		
		System.gc();
//		Garbage g2=new Garbage();
//		g2=g1;
//		System.gc();
		
	}
	

}
