package com.Array;

import java.util.Arrays;

public class SelectSort {
public static void main(String[] args) {
	int arr[]= {10,20,9,1,2,3,90};
 
	
	for(int l:arr) {
		System.out.println(l);
	}
	
	  for (int i = 0; i < arr.length - 1; i++)  
      {  
          int index = i;  
          for (int j = i + 1; j < arr.length; j++){  
              if (arr[j] < arr[index]){  
                  index = j;//searching for lowest index  
              }  
          }  
          int smallerNumber = arr[index];   
          arr[index] = arr[i];  
          arr[i] = smallerNumber;  
			
}
		for(int l:arr) {
			System.out.println(l);
		}


}


}
