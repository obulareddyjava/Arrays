package com.Arrays;

public class Student1 {
	private int sno;
	private String s;
	private String Course;
	
	Student1(int a,String s,String c){
		this.sno=a;
		this.s=s;
		this.Course=c;
	}
	
	public static void main(String[] args) {
		Student1 s=new Student1(100,"","");
		System.out.println(s.hashCode());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Course == null) ? 0 : Course.hashCode());
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + sno;
		return result;
	}

	
	
}
