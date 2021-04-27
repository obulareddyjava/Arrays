package com.careteiq.apr3.multithrading;

public class MultiRun implements Runnable{
	
	public void run() {
		System.out.println("Runnable implemented");
	}
	public static void main(String[] args) {
		
	
	MultiRun m=new MultiRun();
	Thread t=new Thread(m);
	

	t.start();
	
	

	}

}
