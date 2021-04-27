package com.Arrays;

import java.util.Scanner;

public class Arrayscons {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of rows and columns");
			int rows=sc.nextInt();
			int cols=sc.nextInt();
			int a[][]=new int[rows][cols];
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					System.out.println("the index value of"+ i+" "+j);
					
					System.out.println();
					 a[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("*************************");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					System.out.println(a[i][j]);
				}
				System.out.println("");
			}
		}
}
