package com.apr1.owncode;

import com.apr1.Student;

public class PersonTest {
	public static void main(String[] args) {
		
	

	
	Person p1=new Person(1,"Jany");
	Person p2=new Person(2,"Jany");
	Person p3=new Person(2,"Jany");
	Student s=new Student();
	
	
	System.out.println("hash code of p1 is"+p1.hashCode());
	System.out.println("hash code of p2 is"+p2.hashCode());
	System.out.println("hash code of p3 is"+p3.hashCode());
	
	System.out.println(p2.equals(s));
	
	

}
	}
