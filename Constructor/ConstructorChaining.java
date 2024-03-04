 
public class ConstructorChaining {   //Constructor Chaining
	ConstructorChaining(int a){
		System.out.println(1);
	}
	ConstructorChaining(){
		this(10);
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		ConstructorChaining c1 = new ConstructorChaining();
		System.out.println("End");
		
		System.out.println("================");
		
		
		System.out.println("Start");
		ConstructorChaining c2 = new ConstructorChaining(10);
		System.out.println("End");
		
	}
	
	
}
