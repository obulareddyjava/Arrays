package com.Arrays;

public class Example {
	int x;
	Example(int x){
		this.x=x;
	}
	@Override
	public int hashCode() {
		return x;
	}
	public int JVMHC() {
		return super.hashCode();
	}

}
