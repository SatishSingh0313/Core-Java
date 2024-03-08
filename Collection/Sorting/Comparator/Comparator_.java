package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		}
	
	@Override
		public String toString() {
			return "[Employee Id "+id+" and Name "+name+"]";	
	}
	}

class SortId implements Comparator<Employee>{

	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}		
}

public class Comparator_ {
public static void main(String[] args) {
	
	Employee e1 = new Employee(102,"Satish");
	Employee e2 = new Employee(104,"Dk");
	Employee e3 = new Employee(101,"Rk");
	
	SortId s1 = new SortId();   //Sorting Base on Id
	
	ArrayList e = new ArrayList();
	e.add(e1);
	e.add(e2);
	e.add(e3);
	
	Collections.sort(e,s1);
	for(Object ref:e) {
		System.out.println(ref);
	}
	}
}
