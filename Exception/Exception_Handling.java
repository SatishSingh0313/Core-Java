package handling.exception;

public class Exception_Handling {
	
	public static void test(int num) {
		
		try{
			int res = 50/num;
		System.out.println(res);
		
		} catch(ArithmeticException e) {
			
			ArithmeticException e1 = new ArithmeticException();
			
			System.out.println(e1); //Print Complete Exception Name (java.lang.ArithmeticException)
			
			e.printStackTrace();
			
		System.out.println("Invalid Input");
		}	
	}
	public static void main(String[] args) {
		test(10);
		test(0);  //java.lang.ArithmeticException: / by zero
		test(50);
		System.out.println("Hello");
		
	}
}
