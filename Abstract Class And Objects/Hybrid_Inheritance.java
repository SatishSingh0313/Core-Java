
abstract class Test_Yantra{  //Abstract Class Using Hybrid Inheritance
	abstract public void Userid(String id);
	abstract public void Userpwd(long pwd); 
	
}
 class Jspider extends Test_Yantra{

	@Override
	public void Userid(String id) {
		System.out.println(" Jspider Userid is : "+ id);
		
	}

	@Override
	public void Userpwd(long pwd) {
		System.out.println("Jspider User Password is :"+ pwd);
		
	}
	 
 }
 class Qspider extends Jspider{
	 @Override
		public void Userid(String id) {
			System.out.println("Qspider Userid is : "+ id);
			
		}

		@Override
		public void Userpwd(long pwd) {
			System.out.println("Qspider User Password is :"+ pwd);
			
		}	  
 }
 class PySpider extends Qspider{
	 @Override
		public void Userid(String id) {
			System.out.println("Pyspider Userid is : "+ id);
			
		}

		@Override
		public void Userpwd(long pwd) {
			System.out.println("Pyspider User Password is : "+ pwd);
			
		}	 
 }
 class MernSpider extends Qspider{
	 @Override
		public void Userid(String id) {
			System.out.println("MernSpider Userid is : "+ id);
			
		}

		@Override
		public void Userpwd(long pwd) {
			System.out.println("MernSpider User Password is : "+ pwd);
			
		}	
 }
 class Software extends Test_Yantra{
	 @Override
		public void Userid(String id) {
			System.out.println("Test Userid is : "+ id);
			
		}

		@Override
		public void Userpwd(long pwd) {
			System.out.println("Test User Password is : "+ pwd);
			
		}	
	 
 }
 
public class Hybrid_Inheritance {
	public static void main(String[] args) {
		PySpider p1 = new PySpider();
		p1.Userid("Py@12555");
		p1.Userpwd(54545651654L);
		
		System.out.println("=================");
		
		MernSpider m1 = new MernSpider();
		m1.Userid("Mern@454564");
		m1.Userpwd(4556456454L);
		
		System.out.println("===============");
		
		Software s1 = new Software();
		s1.Userid("sat@4553");
		s1.Userpwd(45465454545L);
		
	}

}
