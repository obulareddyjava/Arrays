package com.createiq.apr2.deepclone;

public class Name implements Cloneable {

	private String fname;
	private String lname;
	
	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	


//	@Override
//	public String toString() {
//		return "Name [fname=" + fname + ", lname=" + lname + "]";
//	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
