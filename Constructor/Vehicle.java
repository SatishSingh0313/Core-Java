
public class Vehicle {    //Constructor Overloading
	 Vehicle(String brand, int cost){
		 System.out.println("Brand "+brand +"Cost "+cost);	 
	 }
	 
 Vehicle(String brand){
	 System.out.println("Brand "+brand);
	 }
 
 Vehicle(String brand, String fuel){
	 System.out.println("Brand "+"Fuel "+fuel);
 }
 
 Vehicle(int cost,String brand){
	 System.out.println("Cost "+cost+"Brand "+brand);
	 
 }
 
 Vehicle(){
	System.out.println("No argument Constructor"); 
 }

	public static void main(String [] args) {
		Vehicle v1=new Vehicle("BMW",1500);
		Vehicle v2=new Vehicle("BMW");
		Vehicle v3=new Vehicle("BMW","Petrol");
		Vehicle v4=new Vehicle(1500,"BMW");
		
	    new Vehicle();
		
	}
}
		
	
