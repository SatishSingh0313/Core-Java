package handling.exception;

  public class Array_Exception {
	public static void main(String[] args) {
	
		try{
		int[] a= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[0]);  
		System.out.println(a[1]);
		System.err.println(a[2]);
		System.out.println(a[3]);
		
    } catch(ArrayIndexOutOfBoundsException e){
    	
	//ArrayIndexOutOfBoundsException e1 = new ArrayIndexOutOfBoundsException();
		
		e.printStackTrace();
		e.getMessage();
		System.out.println("invalid Input");
	}
	
	finally {
		System.out.println("This is a Finally Block");
	}
	
	System.out.println("-----------------");
	
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	  }
	}
  }
