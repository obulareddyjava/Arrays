package com.exceptionsmar29;

public class NormalExc {
	
	public static void main(String[] args) {
		int[] arr=new int[110];
		arr[110]=10;
		try {
			System.out.println(arr[110]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			System.out.println("catch1");
		}catch(Exception e) {
			e.getMessage();
			System.out.println("Catch 2");
		}
				}

}
