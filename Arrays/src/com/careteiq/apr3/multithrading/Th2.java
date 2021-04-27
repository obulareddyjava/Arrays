package com.careteiq.apr3.multithrading;

public class Th2 extends Thread {

	public void run() {
		for(int i=5;i<10;i++) {
			
			System.out.println(i);
		}
	}

}
