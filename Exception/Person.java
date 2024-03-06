package handling.exception;

public class Person {
public static void main(String[] args) {
	
	System.out.println("Welcome");
	try {
	int[] Person={1,2,3,4,5};
	
	System.out.println(Person[9]);
	
	}catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e.getStackTrace());
		
		System.out.println(e.getMessage());
		
		String message = e.getMessage();
		
		System.out.println(message);
	}
	
	finally {
		System.out.println("[finally block]-> Something Error");
	}
	
	System.out.println("----------------");
	
	for(int i=1;i<=10;i++) {
		
		System.out.println(50/i);
		
		try {
		Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
