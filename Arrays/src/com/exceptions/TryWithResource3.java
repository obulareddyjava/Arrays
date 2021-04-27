package com.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource3 {
	public static void main(String[] args) {
		int a=0;
		
		try(FileWriter fw=new FileWriter("s.txt");  
				FileReader fr=new FileReader("l.txt")){
			fw.write("Hello Kumfuuu");
			System.out.println("Sucessfully Written");
			System.out.println("Now File reading");
			
			while((a=fr.read())!=-1) {
				System.out.print((char)a);
				
			}
			
		} catch (IOException e) {
			//e.printStackTrace();
			//e.getMessage();
			e.toString();
		}
		finally {
			System.out.println("It is Excuted ");
		}
	}

}
