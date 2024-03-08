package comparable;

import java.util.TreeSet;

 class Person implements Comparable<Person>{
	int age;
	
	Person(int age){
	this.age=age;
    }	

    public String toString() {
	return "Age: "+age; 
    }

    @Override
    public int compareTo(Person p) {
	return this.age - p.age;       // Sorting Base on Age
	}
    }

public class ComParable_1 {
  public static void main(String[] args){
	  
	    Person a1 = new Person(10);
	    Person a2 = new Person(5);
	    Person a3 = new Person(20);
	    Person a4 = new Person(15);
		
	TreeSet<Person> t = new TreeSet<Person>();
	
	t.add(a1);
	t.add(a2);
	t.add(a3);
	t.add(a4);

	for(Person res : t)
	System.out.println(res);
}
}
