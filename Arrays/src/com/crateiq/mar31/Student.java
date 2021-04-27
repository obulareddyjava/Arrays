package com.crateiq.mar31;



public class Student extends Object implements Cloneable {
	
	int Rollno;
	String name;
	
	
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + "]";
	}

	public Student(int rollno, String name) {
		super();
		Rollno = rollno;
		this.name = name;
	}
	
	//for object wee are cresting clone
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		Student s=new Student(1,"siva");
		try {
			Student s1=(Student)s.clone();
			System.out.println(s);
			System.out.println(s1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	

}
