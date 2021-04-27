package com.careteiq.apr3.multithrading;

public class Th3 extends Thread{
	
	public void run() {
		for(int i=10;i<15;i++) {
			
			System.out.println(i);
		}
	}


}
