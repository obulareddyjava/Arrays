package com.createiq.wrapper;

import java.util.GregorianCalendar;

public class GetclassMethod {
public static void main(String[] args) {
	GregorianCalendar gr=new GregorianCalendar();
	GetclassMethod gm=new GetclassMethod();
	
	//to print out the class
	System.out.println(gr.getClass());
	System.out.println(gm.getClass());
	System.out.println(gr.after(gm));
	
}
}
