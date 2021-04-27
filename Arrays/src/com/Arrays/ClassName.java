package com.Arrays;



public class ClassName implements Cloneable{
	
	public ClassName clone() throws CloneNotSupportedException {
		return (ClassName)super.clone();
		
	}
		
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ClassName cs =new ClassName();
		ClassName c=cs.clone();
		System.out.println(c);
	
		
	}
}

