package handling.exception;

  public class Arithmetic_Exception {
    public static void main(String[] args){
    	
		try{
			System.out.println(20/0);
			
			} catch(ArithmeticException e){
				
			System.out.println("invalid input");
		}
		
		try{
			int[] arr= {10,20,30};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		} catch(ArrayIndexOutOfBoundsException e1){
			
			System.out.println("out of bounds");
		}
		
		
	}
}
