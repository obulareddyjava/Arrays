package com.crateiq.mar31;

public class CollegeStudent implements Cloneable {
	
	int Rollno;
	String name;
	public CollegeStudent(int rollno, String name) {
		super();
		Rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "CollegeStudent [Rollno=" + Rollno + ", name=" + name + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		CollegeStudent cs=new CollegeStudent(100,"classic");
		try {
			CollegeStudent n=(CollegeStudent)cs.clone();
			System.out.println(cs);
			System.out.println(n);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
