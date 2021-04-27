package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	//using try with resources
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("b.txt")){
			String msg="Hello java ";
			//converting String into byte array
		byte[]	 bytearr=msg.getBytes();
			fos.write(bytearr);
			System.out.println("messaged print succesfully");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		}
	}


