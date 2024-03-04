interface Developer{
	void Develop();
}

interface Tester{
	void Test1();
}

 class Wipro{
	 
	 public void Work() {
		System.out.println("Working in Some Project");
	}
	
}
public class Employee extends Wipro implements Developer,Tester{
	@Override
	public void Develop() {
		
		System.out.println("Developing Application");
		
	}
	@Override
	public void Test1() {
	
	System.out.println("Testing Application");	
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.Develop();
		System.out.println("===================");
		e1.Test1();
		System.out.println("===================");
		e1.Work();
		System.out.println("=====================");
		e1.Work();
  }
}
