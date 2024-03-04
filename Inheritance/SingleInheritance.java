
class Father{  //Single Inheritance
	int age=50;
}
class Son extends Father{
	int age = 30;
	void display() {
		int age=20;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Son s1 = new Son ();
	
	s1.display();
	}

}
