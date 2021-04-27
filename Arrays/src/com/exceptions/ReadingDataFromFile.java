package com.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {
	public static void main(String[] args) {
		int a=0;
		FileReader fr=null;
	try {
		System.out.println("try start");
		 fr=new FileReader("axx.txt");
		  while((a=fr.read())!=-1) {
				System.out.print((char)a);
			}
		
		
	} catch (IOException e) {
   e.getMessage();
//	e.printStackTrace();
//	
	//e.toString();	
	}
	
	finally {
		try {
			System.out.println();
			System.out.println("Finally ");
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	System.out.println("Finally program end");
		
	}

}
