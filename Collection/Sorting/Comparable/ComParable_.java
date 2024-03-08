package comparable;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	String name;
	int age;
	double sal;
	
	Employee(String name,int age,double sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	
	public String toString() {
		return name+" , "+age+" , "+sal;
	}
	
//	public int compareTo(Employee e) {
//		return this.name.compareTo(e.name);  //Sorting Base on Name
//	}
	
//	@Override
//	public int compareTo(Employee e) {
//		return (int) (this.age-e.age);  //Sorting Base on Age
//	}
	
	public int compareTo(Employee e) {
		return (int) (this.sal - e.sal);  //Sorting Base on Salary
	}
}

public class ComParable_ {
public static void main(String[] args) {
	
	Employee e1 = new Employee("Rohit",30,2000.50);
	Employee e2 = new Employee("Dinesh",29,1500.49);
	Employee e3 = new Employee("Sharma",26,1400.45);
	Employee e4 = new Employee("Bhunesh",32,2500.75);
	Employee e5 = new Employee("Satish",24,2100.55);
	
	
	TreeSet<Employee> t = new  TreeSet<Employee>();
	
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	
	
	for(Employee res : t) {
		System.out.println(res);
	}
	
		
	
}
}
