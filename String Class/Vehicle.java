package nic;

public class Vehicle {
	int cost;
	
	Vehicle(int cost){
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj) {
		Vehicle v = (Vehicle) obj; //casting
		return this.cost==v.cost;	
	}
	
public static void main(String[] args) {
	Vehicle v1 = new Vehicle(1500);
	Vehicle v2 = new Vehicle(1500);
	
	System.out.println(v1==v2);
	System.out.println(v1.equals(v2));
 }
}
