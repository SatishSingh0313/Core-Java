  package com.satish;

 public class Person {
	
	@Override
	public String toString() {
		return "Satish";
	}
	
  public static void main(String[] args) {
	Person p = new Person();
	
	System.out.println(p);   //implicitly it call toString method()
	System.out.println(p.toString());   //explicitly call toString Method()
  }
}
