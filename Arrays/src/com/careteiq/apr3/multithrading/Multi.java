package com.careteiq.apr3.multithrading;

public class Multi  extends Thread{
	
	
	public void run() {
		System.out.println("Thread Is Executing");
	}
	
		public static void main(String[] args) {
			Multi m1=new Multi();
			m1.start();
			//m1.stop();
		}
}
