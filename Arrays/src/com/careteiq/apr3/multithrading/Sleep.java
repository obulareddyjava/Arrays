package com.careteiq.apr3.multithrading;



public class Sleep extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Sleep s=new Sleep();
		Sleep s1=new Sleep();
		
		s.start();
		//s1.start();
	}
	
	
}
	



