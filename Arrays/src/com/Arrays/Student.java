package com.Arrays;




public class Student {
	private int sno;
	private String s;
	private String Course;
	
	Student(int a,String s,String c){
		this.sno=a;
		this.s=s;
		this.Course=c;
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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Course == null) {
			if (other.Course != null)
				return false;
		} else if (!Course.equals(other.Course))
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}


	public static void main(String[] args) {
		Student s=new Student(100,"","");
		Student s1=new Student(100,"","");
		
			Student1 a=null;
			Student1 a1=null;
			System.out.println(s);
	
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", s=" + s + ", Course=" + Course + "]";
	}
	

}
