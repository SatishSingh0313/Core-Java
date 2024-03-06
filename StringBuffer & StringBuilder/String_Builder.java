package com.buffer.builder;

 //StringBuilder Mutable,not Thread safe,and not Synchronized

public class String_Builder {
	    public static void main(String[] args) {
	    	
	        StringBuilder sb = new StringBuilder();

	        sb.append("Hello");
	        sb.append(" World");  //Hello World

	        sb.insert(5, ", Java");  //Hello, Java World

	        sb.replace(6, 11, "Java"); //Hello,Java World

	        sb.delete(0, 5);  //,Java World

	        System.out.println(sb.toString()); // Output: Java, Java World
	    }
	}

