package com.createiq.exceptions.apr5;

import com.createiq.apr2.main;

public class CurrentThread extends Thread{
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
			public static void main(String[] args) {
				CurrentThread ct1=new CurrentThread();
				CurrentThread ct2=new CurrentThread();
				
				ct1.start();
				ct2.start();
				
				
			}
}	
