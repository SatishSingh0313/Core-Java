package in;


 class Laptop {
	
	String name;
	int cost;
	String size;
	
	Laptop(String name,int cost,String size){
		this.name=name;
		this.cost=cost;
		this.size=size;
		
	}
	
	public String toString() {
		
		return "Name : "+name+", Cost : "+cost+", Size : "+size;
	}

}

public class Customer {
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Dell",20000,"2GB");
		Laptop l2= new Laptop("HP",30000,"4GB");
		Laptop l3 = new Laptop("Apple",40000,"8GB");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		System.out.println("---------------------");
		
		Laptop[] l = {l1,l2,l3,}; 
		
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
			System.out.println(l[i].name+" "+l[i].cost+" "+l[i].size);
		}
		
	}
}
