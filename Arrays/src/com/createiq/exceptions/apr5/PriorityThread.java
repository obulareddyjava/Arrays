package com.createiq.exceptions.apr5;

import com.createiq.apr2.main;

public class PriorityThread  extends Thread{
	   @Override
	public void run() {
		   System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	   public static void main(String[] args) {
		PriorityThread pt=new PriorityThread();
		PriorityThread pt1=new PriorityThread();
		
		pt.setPriority(MIN_PRIORITY);
		pt1.setPriority(MAX_PRIORITY);
		pt.start();
		pt1.start();
	}

}
