package com.createiq.wrapper;

import java.util.GregorianCalendar;

public class CloneMethod {
	
	
	public void finalize() {
		System.out.println("garbage collection ");
	}

	public static void main(String[] args) {
//		GregorianCalendar gre=new GregorianCalendar();
//		GregorianCalendar y=(GregorianCalendar) gre.clone();
//		System.out.println(gre.getTime());
//		System.out.println(gre.getTime());
		CloneMethod cm=new CloneMethod();
		cm=null;
		System.gc();
	}
}
