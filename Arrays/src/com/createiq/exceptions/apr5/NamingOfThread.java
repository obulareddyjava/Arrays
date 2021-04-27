package com.createiq.exceptions.apr5;

import com.createiq.apr2.main;

public class NamingOfThread extends Thread  {
		public void run() {
			System.out.println("Running");
		}
		
		public static void main(String[] args) {
			NamingOfThread nt1=new NamingOfThread();
			NamingOfThread nt2=new NamingOfThread();
			
			System.out.println(nt1.getName());
			System.out.println(nt2.getName());
			
			nt1.start();
			nt2.start();
			
			nt1.setName("camthread");
			System.out.println("after naming the thread"+nt1.getName());
		}
	
}
