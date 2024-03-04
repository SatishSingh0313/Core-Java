
public class Method {

	public static double test(int a , int b) {
		double res = a+b;
		return res;
	}
	public int add(int a,int b) {
		int add=a+b;
		System.out.println("First No."+a+" and Seccond No."+b+" Total is "+add);
		return add;
	}
	public static void main(String[] args) {
		
		System.out.println(test (10 , 20));
		System.out.println(test (20 , 30));
		System.out.println(test (30 , 40));
		
		 Method m1=new Method();
		 m1.add(20, 30);
		 
	}
}
