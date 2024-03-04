package wrapper.classs;

public class WrapperClass {
public static void main(String[] args) {
	int a=50;
	Integer b=a; //Autoboxing
	System.out.println(a);
	System.out.println(b);
	System.out.println("--------------------");
	Integer c = new Integer(100);
	int d=c; //Unboxing
	System.out.println(c);
	System.out.println(d);
}
}
