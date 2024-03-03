
public class Employees {     //Constructor
	int id;
	String name;
	double salary;

	Employees(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("Employee id "+ this.id);
		System.out.println("Employee name "+ this.name);
		System.out.println("Employee salary "+ this.salary);
	}
	public static void main(String[] args) {
		Employees e1=new Employees(101,"Satish",1121.20);
		Employees e2=new Employees(222,"Singh",1250.20);
		
	 System.out.println("Employee Details");
	 System.out.println("------------");
	 
	 e1.display();
	 System.out.println("------------");
	 e2.display();
	}
}