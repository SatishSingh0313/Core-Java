
abstract class Vehicle{
	abstract public void test(int model);
	
	Vehicle(String name){
		System.out.println("Brand : "+ name);
	}
}
class Bike extends Vehicle{
	
	Bike(int cost) {
		super("KTM");
		
	}

	@Override
	public void test(int model) {
		System.out.println("Model : " + model);
		
	}
}

class Hero extends Bike{
	
	Hero(int cost) {
		super(cost);
		System.out.println("This is a Hero bike cost is "+ cost);
	}

	@Override
	public void test(int model) {
		System.out.println("Model : " +model);
	}
}
class Honda extends Bike{

	Honda(int cost) {
		super(cost);
		System.out.println("This is a Honda bike cost is " + cost);
		
	}
	@Override
	public void test(int model) {
		System.out.println("Model : " +model);
	} 
	
}
public class Ride {
	public static void main(String[] args) {
		
	Hero h1 = new Hero(2000);	
	h1.test(2022);
	System.out.println("------------------------");
	Honda h2 = new Honda(5000);
	h2.test(2022);
				
	}
}
