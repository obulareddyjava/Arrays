package com.Arrays;

public class Hashcod extends Object {
	int id=10;
	int ids=20;
	

	
	

	
	@Override
	public int hashCode() {
		int result=id+ids;
		return result;
	}

      public static void main(String[] args) {
		Hashcod hc=new Hashcod();
		Hashcod hc1=new Hashcod();
	
		System.out.println(hc);
		System.out.println(hc1.hashCode());
		System.out.println(hc1);
		System.out.println(hc1.hashCode());

	}







	


}
