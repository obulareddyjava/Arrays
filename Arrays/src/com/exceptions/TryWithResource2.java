package com.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource2 {
	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("class.txt")){
			fw.write("Hello Kumfuuu");
			System.out.println("Sucessfully Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
