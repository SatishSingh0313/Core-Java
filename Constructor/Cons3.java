
class Gmail_Login{
	String userid;
	long pwd;
	Gmail_Login(String userid ,long pwd){
		this.userid=userid;
		this.pwd=pwd;
		System.out.println(userid +" "+ pwd);
		
	}
  }
	public class Cons3 {
	public static void main(String[] args) {
		Gmail_Login user1 = new Gmail_Login("abc@gmail.com" ,  12345);
		Gmail_Login user2 = new Gmail_Login("xyz@gmail.com" , 98752155455l);
	}

}
