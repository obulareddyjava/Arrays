package com.createiq.apr2.deepclone;

import com.createiq.wrapper.CloneMethod;

public class User implements Cloneable {
	
	private int id;
	private Name n;//reference
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
	
	

	
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", n=" + n + ", Address=" + Address + "]";
//	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		
//		User user = (User) super.clone();
//	   user.n=(Name)n.clone();
//     return user;
		//return super.clone();
		User user = (User) super.clone();
		user.n = (Name) user.n.clone();
		
		return user;
	}
	
	
	
	

}
