package com.satish;

public class Student {
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		
		return "Name: "+name;
	}
public static void main(String[] args) {
	
	Student s1 = new Student("Satish");
	Student s2 = new Student("Singh");
	
	System.out.println(s1); //implicitly it call toString method()
	System.out.println(s2);
	
	System.out.println("----------------");
	
	System.out.println(s1.toString());   //explicitly call toString Method()
	System.out.println(s2.toString());
}
}
