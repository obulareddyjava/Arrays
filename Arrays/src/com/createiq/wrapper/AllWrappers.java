package com.createiq.wrapper;

public class AllWrappers {
	
	public static void main(String[] args) {
		
		byte b=111;
		short s=12;
		int i=11;
		char ch='a';
		boolean n=false;
		long l=100L;
		float f=50.9f;
		double d=109.9998D;
		
			//converting primitive to wrapper
		System.out.println("Autoboxing is started");
		Byte byt=Byte.valueOf(b);
		Short sh=Short.valueOf(s);
		Integer in=Integer.valueOf(i);
		Character c=Character.valueOf(ch);
		Boolean bh=Boolean.valueOf(n);
		Long ll=Long.valueOf(l);
		float ff=Float.valueOf(f);
		Double db=Double.valueOf(d);
		
		System.out.println(byt+"\n"+sh+"\n"+in+"\n"+c+"\n"+bh+"\n"+ll+"\n"+ff+"\n"+db);
		
		//converting warpper to primitive or unboxing
		byte g=(byte)byt.intValue();
		short o=sh;
		System.out.println(g+" "+o);
		
}
}