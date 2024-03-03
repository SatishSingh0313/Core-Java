
 class Computer{   //Hierarchical Inheritance
	String brand="Laptop";
	
}
  class Lenovo extends Computer{
	 int cost=15000;
	 void Start() {
		 System.out.println("Lenovo Computer");
	 }
	 
 }
  class Dell extends Computer{
	  String mgf = "india";
	 String power= "DC";
	 void Stop() {
		 System.out.println("Dell computer");
	 }
 }
 class Keybord extends Dell{
	 String name = "Bluthoot usb";
	 void On() {
		 System.out.println("Keybord on");
	 }
	 
 }
 class Mouse extends Dell{
	 String name = "Mouse usb";
	 void On() {
		 System.out.println("Mouse on");
	 }
 }
public class Hierarchical_Inheritance{
	public static void main(String[] args) {
		Lenovo l=new Lenovo();
		System.out.println(l.brand+" "+l.cost);
		l.Start();
		
		System.out.println("---------");
		
		Dell d1= new Dell(); 
		System.out.println(d1.brand+ " "+d1.power);
		
		
		d1.Stop();
		System.out.println("------------");
		
		Keybord k1 = new Keybord();
		System.out.println(k1.mgf+" "+k1.name);
		
		Mouse m1 = new Mouse();
		System.out.println(m1.mgf+ " "+m1.name);
		
		
	   }
	

	}
	
