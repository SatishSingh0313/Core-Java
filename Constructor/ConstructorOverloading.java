class A{
	 String username;
	 long password;
	 float mo_number;
	
	A(String username){
		this.username=username;
		System.out.println("Login with username : "+ username);
	}
	A(String username,long password){
		this.password=password;
		System.out.println("Login with username and password: "+ username+" "+ password);
	}

A(String username,long password,float mo_number){
	this.username=username;
	this.password=password;
	this.mo_number=mo_number;
	System.out.println("login with username,password and mo_number: "+ username +" "+ password +" "+ mo_number);
}}
public class ConstructorOverloading {
public static void main(String[] args) {
	A a1 = new A("satish");
	A a2 = new A("satish",459844);
	A a3 = new A("satish",78238,5489489440l);
}
}
