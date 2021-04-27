package com.apr1.Short;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1=new Person(10,"Sambhudu");
		Person p2=new Person(10,"Sambhudu");
		Person p3=new Person(20,"Sambhudu");
		Person p4=p1;
		
//		//without overiding hash code same reference
//		System.out.println("hash code of p1 is:"+p1.hashCode());
//		System.out.println("hash code of p4 is:"+p4.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());
		
		//with overiding hash code with data check
				System.out.println("hash code of p1 is:"+p1.hashCode());
				System.out.println("hash code of p4 is:"+p4.hashCode());
				System.out.println("hash code of p2 is:"+p2.hashCode());
				System.out.println("hash code of p3 is:"+p3.hashCode());
				
		
//		
//		//without overriding toString
//		System.out.println(p1);
//		
		//without overriding equals now checking with reference not with content
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	
		//without overriding toString
		//System.out.println(p1);
		
		//overiding to string
//	System.out.println(p1);
		
		
		
		
	}

}
