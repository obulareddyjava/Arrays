package com.createiq.apr2.ShallowClone;

import com.createiq.wrapper.CloneMethod;

public class User implements Cloneable  {
	
	private int id;
	private Name n;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getN() {
		return n;
	}
	public void setN(Name n) {
		this.n = n;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public User(int id, Name n, String address) {
		super();
		this.id = id;
		this.n = n;
		Address = address;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	

}
