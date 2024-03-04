interface Pen{
	String name = "Satish";  //public static final String name="Satish";  (by default)
	void write();	//public abstract void write();  (by default)
}

interface Pencil extends Pen{
	void Draw();
	
}
 abstract class Study{
	public abstract void test();
 }
 
class Book extends Study implements Pen ,Pencil {
	@Override
	public void write() {
		System.out.println("Write somthing");
		int a =5;
		for(int i=1; i<=a; i++) {
			System.out.println(i);
		}
	}
	@Override
	public void Draw() {
		System.out.println("Drawing Something");
	}
	@Override
	public void test() {
		int a=1;
		for(int i=5;i>=a;i--) {
			System.out.println(i);
			
		}
		
		System.out.println("this is a abstract test method");
		
	}
	
	}


public abstract class MainClass {
	
	public static void main(String[] args) {
		System.out.println(Pen.name);
		System.out.println("============");
		Book b1 = new Book();
		b1.write();
		System.out.println("============");
		b1.Draw();
		System.out.println("============");
		 b1.test();
	}

}
