package com.apr1;

public class ShallowTest {
	public static void main(String[] args) {
		
	
	
	Department dept=new Department(1, "Lucky","Dev");
	Employee emp1=new Employee(2,"siva",dept);
	Employee emp2=null;
	//copy of an shallow cloning
	try {
		emp2=(Employee)emp1.clone();
	
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(emp1.dept.designation);
	
}
}
