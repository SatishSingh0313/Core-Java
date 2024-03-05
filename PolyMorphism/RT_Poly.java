
class Employee{  // RunTime PolyMorphism
	void Work() {
		System.out.println("Employee is Working Media Project ");
	}
}
class Developer extends Employee{
	
	@Override
	void Work() {
		//super.Work();
		System.out.println("Developer is Working Insta Application ");
	}
}
class Tester extends Employee{
	@Override
	void Work() {
		//super.Work();
		System.out.println("Tester is Working Flipkart  Application");
	}
}
public class RT_Poly {
public static void main(String[] args) {
	System.out.println("<---------Run Time PolyMorphism---------->");
	System.out.println("------------------------------------------");
	Employee e1 = new Developer();
	e1.Work();
	
	Employee e2 = new Tester();
	e2.Work();
	System.out.println("=============OR==============");
	Employee emp;
	emp=new Developer();
	emp.Work();
	
	emp=new Tester();
	emp.Work();
  }	
}
