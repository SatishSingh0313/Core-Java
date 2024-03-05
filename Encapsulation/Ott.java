
 class User {	
  private  double Bal;

 public void setBal(double Bal){
	
	if(Bal>0) {
	System.out.println("Welcome to Our Service");
	System.out.println("You'r Prime Members Enjoy Our Services... ");
	this.Bal=Bal;
	
	}else {
		System.out.println("Sorry!! Your Balance is low please Recharge immediately");
	}
 }

  public double getBal(){
	
	return Bal;
	
   }
 }
 class Service{
	public static void PriMember(double  amt, User a1) {
		double b1=a1.getBal();
		b1=b1+amt;
		a1.setBal(b1);
	}
 }	
	
  public class Ott {
  public static void main(String[] args) {
	User user=new User();
	Service.PriMember(200, user);
	
   }
  }
