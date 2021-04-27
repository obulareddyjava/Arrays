package com.Arrays;

public class IdentiyTest {

	public static void main(String[] args) {
		  Example e=new Example(100);
		  Example e1=new Example(200);
		  Example e2=new Example(300);
		  
		  System.out.println(e.hashCode());
		  System.out.println(e1.hashCode());
		  System.out.println(e2.hashCode());
		  
		  System.out.println(System.identityHashCode(e));
		  System.out.println(System.identityHashCode(e1));
		  System.out.println(System.identityHashCode(e2));
		  
		  System.out.println(e.JVMHC());
		  System.out.println(e1.JVMHC());
		  System.out.println(e2.JVMHC());
	}

}
