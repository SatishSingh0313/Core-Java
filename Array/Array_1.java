package com;

public class Array_1 {
  public static void main(String[] args) {
	  
	  int[] a = {10, 20, 30}; 
	  
	  System.out.println(a[0]);
	  System.out.println(a[1]);
	  System.out.println(a[2]);
	  
	  System.out.println("---------------");
	  
	  for(int i=0; i<a.length; i++){ 
	  System.out.println(a[i]);
	  } 
	  
	  System.out.println("---------------");
	  
	  for(int i=a.length-1; i>=0; i--){ 
	  System.out.println(a[i]);
	  } 
	  
	  System.out.println("--------------------");
	  
	  int[] data = {10, 20, 30, 40, 50}; 
	  int sum = 0;
	  
	  for(int i=0; i<data.length; i++){ 
	  sum = sum + data[i];     // sum += data[i];
	  } 
	  
	  System.out.println("Sum: "+sum); 
	  System.out.println("Average: "+ (sum/data.length));
	  
   }
}
