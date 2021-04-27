package com.crateiq.mar31;

public class Employee extends Object  {
	
	int i=1;
	
	private int eid;
	private String ename;
//	Employee(){
//		System.out.println("Employee constructor");
//	}
	public Employee(int eid, String ename) {
		
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	
	
	

}
