package com.Arrays;

public class Clone implements Cloneable {
	int x=10, y=100;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c=new Clone();
		c.x=5;
		c.y=10;
		
		Class<? extends Clone> cls=c.getClass();
		String s=cls.getName();
		
		//System.out.println(s);
		
		Clone c1=(Clone)c.clone();
		
		
	
		System.out.println(c1);
		System.out.println(c.getClass());
		
		
		System.out.println(c==c1);
		System.out.println(c.hashCode()==c1.hashCode());
		
		System.out.println(c.x+"...."+c.y);
		System.out.println(c1.x+"...."+c1.y);
		
		c1.x=11;
		c1.y=12;
		
		System.out.println(c.x+"...."+c.y);
		System.out.println(c1.x+"...."+c1.y);
		
		
	}
	}
