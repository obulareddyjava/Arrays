package com.Array;

public class FactorialNumber {
  public static  int factorial(int number) {
	  if(number==0 || number==1) {
		  return number;
	  }
	  else {
		  return number+factorial(number-1);
	  }
  }
  public static void main(String[] args) {
	factorial(12);
	System.out.println(FactorialNumber.factorial(90));
}
  
}
