package com.buffer.builder;

public class Buffer_Builder {
	public static void main(String[] args) {
		
		String s ="Hello";   //1.0(Jdk) String Immutable ,not Thread Safe and not Synchronized
		System.out.println(s);
		
		s.toUpperCase();
		System.out.println(s);
		
//		s="js";
//		System.out.println(s);
		
		s.concat("Java");
		System.out.println(s);
		s = s.concat(" Java");
		System.out.println(s);
		
		System.out.println("------------String--------------");
		
		String s1 ="World";
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println("------------------------");
		
		String s2 = new String("Java");
		System.out.println(s2);
		
		String s3 = new String("Java");
		System.out.println(s3);
		
		System.out.println("-------------StringBuffer-------------");
		StringBuffer sb = new StringBuffer("Hi"); //1.5(jdk)StringBuffer Mutable,Thread safe,and Synchronized
		System.out.println(sb);
		sb.append(" sql");
		System.out.println(sb);
		
		
		System.out.println("------------StringBuilder-------------");
		
		StringBuilder sd =  new StringBuilder("HTML"); //1.0(jdk) StringBuilder Mutable,not Thread safe,and not Synchronized
		System.out.println(sd);
		sd.append(" AND JAVA");
		System.out.println(sd);
		
	}
}
