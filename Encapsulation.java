class Amazon {
	
private  double Bal;

public void setBal(double Bal){
	
	if(Bal>=0) {
	System.out.println("Prime Member ");
	System.out.println("Watching Video");
	this.Bal=Bal;
	}
	else {
		System.out.println("Low Balance");
		System.out.println("No Prime Member");
	}
}

public double getBal(){
	
	return Bal;
	
}
}
class OTT{
	public static void PriMember(double  amt, Amazon a1) {
		double b1=a1.getBal();
		b1=b1+amt;
		a1.setBal(b1);
	}
	public static void NonPrimeMember(double amt, Amazon a1) {
		double b2=a1.getBal();
		b2=b2-amt;
		a1.setBal(b2);
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Amazon user=new Amazon();
	OTT.PriMember(399, user);
	System.out.println("-------------");
	OTT.NonPrimeMember(499, user);
}
}
