package wrapper.classs;

public class WrapperClass {
public static void main(String[] args) {
	int a=50;
	Integer b=a;      // AutoBoxing (primitive to wrapper) 
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("--------------------");
	
	Integer c = new Integer(100);
	int d=c;          // UnBoxing (wrapper to primitive)
	System.out.println(c);
	System.out.println(d);
	
	System.out.println("---------------------");
	
	byte b1=10;
	Byte b2= b1; 		 // AutoBoxing (primitive to wrapper) 
	System.out.println(b1);
	System.out.println(b2);
	
	Byte bt1=new Byte((byte) 5);
	byte bt2=bt1;    		 // UnBoxing (wrapper to primitive)
	System.out.println(bt1);
	System.out.println(bt2);
}
}
