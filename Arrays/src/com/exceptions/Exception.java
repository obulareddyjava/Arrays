package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Exception {
	
	
	 void m1() {
		 System.out.println("I am m1");
		 m2();
	 }
	 void m2() {
		 System.out.println("I am m2");
		 m3();
	 }
	
	 
	 void m3() {
		 int  a=0;
	try {
	FileReader fr=new FileReader("j.txt");
	
	while((a=fr.read())!=-1) {
		System.out.println((char)a);
	}
	}catch(IOException e){
		System.out.println(e.getMessage());
		
		
	}
	
	}
	 public static void main(String[] args) {
		 Exception  e=new Exception ();
		 e.m1();
	}
		 
	 }
