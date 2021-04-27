package com.Arrays;

public class StudentTest {
	
	
	
public static void main(String[] args) {
	Student s=new Student(100,"hel","conv");
	Student s1=new Student(100,"hel","conv");
	Student s2=s;
	if(s.equals(s1)) {
		System.out.println("equal ");
		int x=10;
		int y=100;
		System.out.println("adddition os a and b is : "+(x-y));
	}
	else {
		int x=10;
		int y=100;
		System.out.println("adddition os a and b is : "+(x+y));
		System.out.println("not equal");
	}
	
	
	
}
	
}
