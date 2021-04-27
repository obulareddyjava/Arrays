package com.apr1;

public class Employee {
	
	 int id;
	 String name;
	 Department dept;
	public Employee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
