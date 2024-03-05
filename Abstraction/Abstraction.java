
abstract class User{
	abstract void Login();
	abstract public void logout(); 
}
class Web_User1 extends User{

	@Override
	void Login() {
		System.out.println("Web User Login Successfully : ****");
		
	}

	@Override
	public void logout() {
		System.out.println("Web User Logout Successfully");
		
	}
}
class Admin_1 extends User{

	@Override
	void Login() {
		System.out.println("Admin Login Successfully : ****");
		
	}

	@Override
	public void logout() {
		System.out.println("Admin Logout Successfully");
		
	}
}
 class Main_User{
	 public User CreatePwd(int Pwd) {
		 User Reff;
		 if(Pwd==1234) {
			 Reff=new Web_User1();
		 }
		 
		 else {
			 Reff = new Admin_1();
		 }
		return Reff;
		 
	 }
 }
public class Abstraction {
	public static void main(String[] args) {
		Main_User m1=new Main_User();
		User u1=m1.CreatePwd(1234);
		u1.Login();
		u1.logout();
		System.out.println("---------------------------");
		User u2=m1.CreatePwd(4321);
		u2.Login();
		u2.logout();
		
	}

}
