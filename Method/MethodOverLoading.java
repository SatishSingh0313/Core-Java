
	class Calculator {  //Method OverLoading
		
    public int add(int a, int b) {
        return a + b;
        
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


public class MethodOverLoading {
	public static void main(String[] args) {
		
	Calculator c = new Calculator();
	System.out.println("Add Two Number "+c.add(10, 30));
	System.out.println("Add Two Number "+c.add(5,10,15));
	System.out.println("Add Three Number "+c.add(10.5, 20.7));
	
	 
	}
}
