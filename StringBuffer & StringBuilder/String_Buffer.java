package com.buffer.builder;

//StringBuffer Mutable,Thread safe,and Synchronized

public class String_Buffer {   
	public static void main(String[] args) {
		
	        StringBuffer sb = new StringBuffer("Hello");

	        sb.append(" World");  //Java World

	        sb.insert(5, ", Java");  //Hello, Java World

	        sb.replace(6, 11, "Java");  //Hello,Java World

             sb.delete(0, 5);   //,Java World

	        System.out.println(sb.toString()); // Output: Java, Java World
	    }
	}


