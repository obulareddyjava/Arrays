package com.createiq.wrapper;

public class CustomWrapper {
	int i;

	public CustomWrapper(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
	public static void main(String[] args) {
		CustomWrapper cw=new CustomWrapper(12);
		System.out.println(cw);
	}

}
