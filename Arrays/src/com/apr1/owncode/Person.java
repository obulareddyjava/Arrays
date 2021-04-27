package com.apr1.owncode;

public class Person {

	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	//name overide
//	public int hashCode() {
//		int result;  
//		result=name.hashCode();
//		return result;
//	}
	
	//id overide
	public int hashCode() {
		int result=id+name.hashCode();
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if((this.id==id) && (this.name==name))
			return true;
		return false;
				
	}
	
	
	
}
