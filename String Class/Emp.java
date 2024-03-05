package com.satish;

public class Emp {
	String name;
	int id;
	double sal;

	 Emp (String name, int id, double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	
  }
	 @Override
	 		public int hashCode() {
	 		return id;
	 		}
	 
	 @Override
	 	public String toString() {
	 		return name+" "+id+" "+ sal;
	 	}
	 
	 @Override
	 public boolean equals(Object o1) {
		 
		 return this.hashCode()==o1.hashCode()&& this.toString()==o1.toString();
	 }
	 
	public static void main(String[] args) {
		
		Emp e1 = new Emp("Satish",101,1500.50);
		Emp e2 = new Emp("Singh",102,2000.50);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("-----------------");
		
		System.out.println(e1.equals(e2));
		
		
	}
}
