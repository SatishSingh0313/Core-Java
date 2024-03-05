
class Flipkart{  //CompileTime PolyMorphism
	void Purchase(String ProductName) {
		System.out.println("Product Name is : " +ProductName);
	}
	
	void Purchase(int ProductId) {
	System.out.println("Product Id is : " + ProductId);	
	}
	
	void Purchase(String ProductName, int Cost) {
		System.out.println("Product Name is : " +ProductName+ " and Cost is : " +Cost);
	}
	
	void Purchase(int Cost, String ProductName) {
		System.out.println("Product Cost is : "+ Cost+" and Product Name is : "+ProductName);
	}
}
public class CT_Poly {
public static void main(String[] args) {
	
	System.out.println("<-----------Compile Time Polymorphism------------->");
	
	System.out.println("----------------------------");
	
	System.out.println("Welcome To Flipkart Customer");
	
	System.out.println("----------------------------");
	Flipkart f1 = new Flipkart();
	f1.Purchase("Mobile");
	f1.Purchase(2121545);
	f1.Purchase("Laptop", 25000);
	f1.Purchase(30000,"Watch");
	
}
}
