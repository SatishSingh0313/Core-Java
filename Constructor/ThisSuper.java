
class Father{     //Use super keyword
	int age=50;
	}
		class Son extends Father{
			int age=30;
	
			void display() {
			int age=10;
		    System.out.println(10); //10
		    System.out.println(this.age); //30
		    System.out.println(super.age); //50
	}
  }
		public class ThisSuper {
		public static void main(String[] args) {
				Son s1=new Son();
					s1.display();
	
}
}
