package com.careteiq.apr3.multithrading;

public class TwiceThread implements Runnable {
	
	public void run() {
		System.out.println("Thread Strated");
	}

		public static void main(String[] args) {
			TwiceThread tt=new TwiceThread();
			Thread t=new Thread(tt);
			t.start();
		   //tt.start();
		}
}
