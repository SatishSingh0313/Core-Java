
abstract class Gmail{  // Using MultiLevel Inheritance
	abstract public void UserName(String name);
	abstract public void UserPwd(long pwd);
}
class User_1 extends Gmail{
	
	@Override
	public void UserName(String name) {
		System.out.println("User_1 Name is :" +name);
	}
	@Override
	public void UserPwd(long pwd) {
		System.out.println("User_1 Password :" + pwd);
	}
	}
class User_2 extends User_1{
	
	@Override
	public void UserName(String name) {
		System.out.println("User_2 Name is :" +name);
	}
	@Override
	public void UserPwd(long pwd) {
		
		System.out.println("User_2 Password is :" +pwd);
	}	
}

public class AbstractMulti {
	public static void main(String[] args) {
		User_2 u2 = new User_2();
		u2.UserName("Satish");
		u2.UserPwd(1554484L);
	
	}				
}



