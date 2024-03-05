package com.satish;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj) {
		
		return this.hashCode()==obj.hashCode() && this.toString()==obj.toString();
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Satish");
		Employee e2 = new Employee(101,"Satish");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		
		
	}
}
