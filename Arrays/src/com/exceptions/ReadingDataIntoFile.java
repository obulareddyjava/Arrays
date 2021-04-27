package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingDataIntoFile {
	public static void main(String[] args) {
		FileWriter fw=null;
	try {
		fw=new FileWriter("a.txt");
		fw.write("My Name Is Bhoomi");
		fw.flush();
		System.out.println("Sucesss");
		fw.close();
	} catch (IOException e) {
		System.out.println("I am Catch");
		e.printStackTrace();
	}
	finally {
		try {
			System.out.println("I am Try block");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		

	
}
}


