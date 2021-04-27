package com.Arrays;

import java.util.Scanner;

public class Arrayconsole {
	  {
			System.out.println();
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rowes ");
		int rows=sc.nextInt();
		System.out.println("enter the value of cols ");
		int cols=sc.nextInt();
		
		int f[][]=new int[rows][cols];
		//using for loop of rows...
		for(int i=0;i<rows;i++) {
			System.out.println();
			for(int j=0;j<cols;j++) {
				System.out.print("enter value:"+i+":"+j);
				
			}
		
		}
		 
	}
	
				
}
