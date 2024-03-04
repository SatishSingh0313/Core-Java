abstract class User{
	abstract public void Login(long pwd);
	abstract  public  void Logout();
	 			
}
class Customer extends User{

	@Override
	public void Login(long pwd) {
		System.out.println("Customer login successfully and pwd is :"+ pwd);
		
	}

	@Override
	public void Logout() {
		
		System.out.println("Customer logout successfully");
	}
	
}
class Admin extends User{

	@Override
	public void Login(long pwd) {
		System.out.println("Admin login successfully and pwd is : "+ pwd);
		
	}

	@Override
	public void Logout() {
		System.out.println("Admin logout successfully");
		
	}
	
}
public class MainAbstractApplication {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.Login(142355L);
		c1.Logout();
		System.out.println("-----------------");
		Admin a1 = new Admin();
		a1.Login(15545L);
		a1.Logout();
	}

}
