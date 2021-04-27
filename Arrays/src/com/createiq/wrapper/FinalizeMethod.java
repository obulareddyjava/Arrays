package com.createiq.wrapper;

import java.util.GregorianCalendar;

public class FinalizeMethod extends GregorianCalendar{
	
	int a=1;
	public static void main(String[] args)  {
		try {
		FinalizeMethod fm=new FinalizeMethod();
		System.out.println(fm.getTime());
		
		
		System.out.println("finally intiLIZED");
		fm.finalize();
		System.out.println("finally CLOSED");
		
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
