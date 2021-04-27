package com.Arrays;

public class AdditionWithArrayParameter {
	
	void addition(int... a){
		if(a.length==0) {
			System.out.println("values are not passed");
		}
		else {
			int sum=0;
			for(int i=0;i<a.length;i++) {
		sum+=a[i];
			
		}
			System.out.println("The sum of int value is: "+sum);
		}
		
	}
	public static void main(String[] aa) {
		AdditionWithArrayParameter a=new AdditionWithArrayParameter();
		a.addition(new int[0]);
		a.addition(2,3,4);
		a.addition(new int[] {100,200,800,700,900});
	}

}
