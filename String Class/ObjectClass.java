package com.satish;

public class ObjectClass {
	
public static void main(String[] args) {
	Object a1=new Object();
	Object a2=new Object();
	
	System.out.println("---hashcode() Methods---");
	
	System.out.println(a1);
	System.out.println(a1.hashCode());
	
	System.out.println(a2);
	System.out.println(a2.hashCode());
	
	System.out.println("---toString() Method---");
	
	String s1=a1.toString();
	System.out.println(s1);
	System.out.println(a1.toString());
	
	System.out.println("---equal() Methods---");
	
	Boolean b1=a1.equals(a2);
	System.out.println(b1);
	System.out.println(a1.equals(a2));
	
	System.out.println(a1.equals(a1));
	
	
}
}
